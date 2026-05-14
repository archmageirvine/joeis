package irvine.oeis.a084;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.PrependSequence;
import irvine.oeis.Sequence1;

/**
 * A084837 Palindromic primes with nonincreasing digits up to the middle and then nondecreasing.
 * @author Sean A. Irvine
 */
public class A084837 extends PrependSequence {

  private static final int[] FIRST = {1, 3, 7, 9};

  /** Construct the sequence. */
  public A084837() {
    super(new Sequence1() {
      private final TreeSet<Z> mA = new TreeSet<>();
      private int mLen = 1;

      private void search(final String n, final int prev, final int remaining) {
        if (remaining == 0) {
          final Z t = new Z(n + new StringBuilder(n.substring(0, n.length() - 1)).reverse());
          if (t.isProbablePrime()) {
            mA.add(t);
          }
          return;
        }
        for (int d = 0; d <= prev; ++d) {
          search(n + d, d, remaining - 1);
        }
      }

      @Override
      public Z next() {
        if (mA.isEmpty()) {
          ++mLen;
          for (final int f : FIRST) {
            search(String.valueOf(f), f, mLen - 1);
          }
        }
        return mA.pollFirst();
      }
    }, 2, 3, 5, 7, 11);
  }
}
