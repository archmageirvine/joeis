package irvine.oeis.a084;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.PrependSequence;
import irvine.oeis.Sequence1;

/**
 * A084836 Palindromic primes with nondecreasing digits up to the middle and then nonincreasing.
 * @author Sean A. Irvine
 */
public class A084836 extends PrependSequence {

  private static final int[] FIRST = {1, 3, 7};

  /** Construct the sequence. */
  public A084836() {
    super(1, new Sequence1() {
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
        for (int d = prev; d < 10; ++d) {
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
