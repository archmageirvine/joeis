/*
MIT License

Copyright (c) 2019 Vladimir Reshetnikov <v.reshetnikov@gmail.com>

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
*/

package irvine.oeis.a002;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.zip.GZIPInputStream;

import irvine.math.SparseInteger;
import irvine.math.r.DoubleUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.string.StringUtils;

/**
 * A002845 Number of distinct values taken by 2^2^...^2 (with n 2's and parentheses inserted in all possible ways).
 * @author Vladimir Reshetnikov
 * @author Sean A. Irvine (Java port)
 */
public class A002845 implements Sequence {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));

  /*
   * A lazily computed sequence of terms of https://oeis.org/A002845:
   * "Number of distinct values taken by 2^2^...^2
   * (with n 2's and parentheses inserted in all possible ways)."
   *
   * The operator `^` in the sequence definition denotes exponentiation
   * (raising its left operand to the power equal to its right operand).
   *
   * We refer to `n` as a size of expression `2^2^...^2`.
   * Note that the sequence is only defined for positive integer indexes `n`.
   */

  // Must be a power of 2
  protected long base() {
    return 2;
  }

  // A map from an expression size to the set of all expressions of that size
  private ArrayList<Set<SparseInteger>> mExpressionsOfSize = new ArrayList<>();

  {
    mExpressionsOfSize.add(null); // 0th
    mExpressionsOfSize.add(Collections.singleton(SparseInteger.create(base())));
  }

  // Returns the set of all expressions of a given size.
  //
  // Fetches the result from <see cref="mExpressionsOfSize"/> if it has been already computed;
  // otherwise computes the set by constructing expressions using smaller expressions for bases and exponents
  // and removing duplicates, and then returns the result after storing it in <see cref="mExpressionsOfSize"/>.
  private Set<SparseInteger> getExpressionsOfSize(final int size) {
    assert size > 0;
    while (size >= mExpressionsOfSize.size()) {
      final int n = mExpressionsOfSize.size();
      //final TreeSet<SparseInteger> result = new TreeSet<>();
      final HashSet<SparseInteger> result = new HashSet<>();
      for (int i = 1; i < n; ++i) {
        for (final SparseInteger base : getExpressionsOfSize(i)) {
          for (final SparseInteger exponent : getExpressionsOfSize(n - i)) {
            result.add(base.power(exponent));
          }
        }
      }
      mExpressionsOfSize.add(result);
    }
    return mExpressionsOfSize.get(size);
  }

  private int mN = 0;
  private long mStart = System.currentTimeMillis();

  @Override
  public Z next() {
    final int count = getExpressionsOfSize(++mN).size();
    if (mVerbose) {
      StringUtils.message("a(" + mN + ")=" + count + " " + DoubleUtils.NF2.format((System.currentTimeMillis() - mStart) / 1000.0) + "s");
    }
    return Z.valueOf(count);
  }

  private static void dumpSet(final File file, final HashSet<SparseInteger> set) throws FileNotFoundException {
    final TreeSet<String> localSort = new TreeSet<>();
    for (final SparseInteger sp : set) {
      localSort.add(sp.toString());
    }
    set.clear();
    try (final PrintStream out = new PrintStream(new FileOutputStream(file))) {
      for (final String sp : localSort) {
        out.println(sp);
      }
    }
  }

  private static BufferedReader reader(final String rootDir, final int n) throws IOException {
    final File gz = new File(new File(rootDir), "A002845." + n + ".dat.gz");
    return gz.exists()
      ? new BufferedReader(new InputStreamReader(new GZIPInputStream(new FileInputStream(gz))))
      : new BufferedReader(new FileReader(new File(new File(rootDir), "A002845." + n + ".dat")));
  }

  private static List<SparseInteger> load(final String rootDir, final int n) throws IOException {
    final ArrayList<SparseInteger> list = new ArrayList<>();
    try (final BufferedReader eBase = reader(rootDir, n)) {
      String eLine;
      while ((eLine = eBase.readLine()) != null) {
        list.add(SparseInteger.parse(eLine));
      }
    }
    return list;
  }


  /**
   * A file based approach to this problem.  Experimental attempts to get large terms
   * without using lots of memory. Assumes all previous sizes are available on disk.
   * @param args index
   * @throws IOException if an I/O error occurs.
   */
  public static void main(final String[] args) throws IOException {
    final String rootDir = args[0];
    final int n = Integer.parseInt(args[1]);
    // Make it so slice is actually the larger of two numbers adding up to n
    // this improves efficiency in the inner loop.  The use should supply
    // values in the range 1..n/2
    final int slice = args.length > 2 ? Integer.parseInt(args[2]) : 0;
    final String fOut = "A002845." + n + ".dat";
    int part = 0;
    if (n == 1) {
      try (final PrintStream out = new PrintStream(new FileOutputStream(new File(new File(rootDir), fOut)))) {
        out.println(SparseInteger.create(2).toString());
      }
    } else if (slice == 0) {
      // This is only useful for smaller n, does all slices, in a non-efficient manner
      final HashSet<SparseInteger> result = new HashSet<>();
      for (int i = 1; i < n; ++i) {
        try (final BufferedReader rBase = reader(rootDir, i)) {
          String rLine;
          while ((rLine = rBase.readLine()) != null) {
            final SparseInteger base = SparseInteger.parse(rLine);
            try (final BufferedReader eBase = reader(rootDir, n - i)) {
              String eLine;
              while ((eLine = eBase.readLine()) != null) {
                final SparseInteger exponent = SparseInteger.parse(eLine);
                result.add(base.power(exponent));
                if (result.size() > 10000000) {
                  dumpSet(new File(new File(rootDir), fOut + "." + slice + "." + ++part), result);
                }
              }
            }
          }
        }
      }
      dumpSet(new File(new File(rootDir), fOut + "." + slice + "." + ++part), result);
    } else {
      // We are going to do slice + m == n with slice < m
      if (2 * slice > n) {
        throw new RuntimeException("Slice should be smaller of numbers slice + m == n");
      }
      final List<SparseInteger> inner = load(rootDir, slice);
      final HashSet<SparseInteger> result = new HashSet<>();
      try (final BufferedReader rBase = reader(rootDir, n - slice)) {
        String rLine;
        while ((rLine = rBase.readLine()) != null) {
          final SparseInteger a = SparseInteger.parse(rLine);
          for (final SparseInteger b : inner) {
            result.add(a.power(b));
            result.add(b.power(a));
            if (result.size() > 10000000) {
              dumpSet(new File(new File(rootDir), fOut + "." + slice + "." + ++part), result);
            }
          }
        }
      }
      dumpSet(new File(new File(rootDir), fOut + "." + slice + "." + ++part), result);
    }
  }
}
