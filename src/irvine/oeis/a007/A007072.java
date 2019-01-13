package irvine.oeis.a007;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007072.
 * @author Sean A. Irvine
 */
public class A007072 implements Sequence {

  // Steps each possible Fibonacci sequence.  Let (a,b) denote the Fibonacci sequence
  // starting with a and b.  We order all possible Fibonacci sequences according to
  // (a,b) < (c,d) iff there exist some N such that aF_n+bF_{n+1} < cF_n + dF_{n+1}
  // for all n >= N.  If we have computed all relevant sequence out to term t, this
  // amounts to sorting the sequences by increasing value of term t.
  //
  // After sorting, we take the leftmost term from each row that does not appear in
  // any previous row.  Finally those terms themselves are sorted to form the
  // sequence.
  //
  // The following uses some heuristics/guesses on how many sequences need be
  // considered and how far they are stepped.  It will eventually detect any mistake
  // it makes.  In particular, at step n we add all sequences (a,b) with a+b=n,
  // and step every sequence out to step n.  Even with this the search is not
  // particularly efficient.

  private final List<List<Z>> mFibonacciSequences = new ArrayList<>();
  private Z mPrev = null;
  private int mN = 0;
  {
    addFiboSequences(1);
    addFiboSequences(2);
  }

  private void addFiboSequences(final int n) {
    for (int a = n, b = 0; b <= a; ++b, --a) {
      final List<Z> fibo = new ArrayList<>();
      Z aa = Z.valueOf(a);
      Z bb = Z.valueOf(b);
      fibo.add(aa);
      fibo.add(bb);
      while (fibo.size() <= n + 3) {
        final Z t = aa.add(bb);
        fibo.add(t);
        aa = bb;
        bb = t;
      }
      mFibonacciSequences.add(fibo);
    }
  }

  @Override
  public Z next() {
    ++mN;
    // Step all existing sequences
    for (final List<Z> fibo : mFibonacciSequences) {
      while (fibo.size() <= mN + 3) {
        fibo.add(fibo.get(fibo.size() - 1).add(fibo.get(fibo.size() - 2)));
      }
    }
    // Add new sequences
    addFiboSequences(mN + 2);
    mFibonacciSequences.sort(Comparator.comparing(a -> a.get(a.size() - 1)));
    final List<Z> boxed = new ArrayList<>();
    final HashSet<Z> seen = new HashSet<>();
    for (final List<Z> fibo : mFibonacciSequences) {
      for (int k = 3; k < fibo.size(); ++k) {
        final Z v = fibo.get(k);
        if (!seen.contains(v)) {
          boxed.add(v); // left-most value of this sequence not already seen
          break;
        }
      }
      seen.addAll(fibo);
    }
    Collections.sort(boxed);
    //System.out.println(boxed);
    final Z res = boxed.get(mN - 1);
    if (mPrev != null && (!mPrev.equals(boxed.get(mN - 2)) || mPrev.compareTo(res) >= 0)) {
      throw new RuntimeException("Heuristic failure detected, last terms likely incorrect: " + boxed);
    }
    mPrev = res;
    return res;
  }

}
