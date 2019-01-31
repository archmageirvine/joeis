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

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import irvine.math.SparseInteger;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002845.
 * @author Vladimir Reshetnikov
 * @author Sean A. Irvine (port to Java)
 */
public class A002845 implements Sequence {
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

  @Override
  public Z next() {
    return Z.valueOf(getExpressionsOfSize(++mN).size());
  }
}
