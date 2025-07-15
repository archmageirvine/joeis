package irvine.oeis.a385;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A385637 allocated for Gonzalo Mart\u00ednez.
 * @author Sean A. Irvine
 */
public class A385637 extends Sequence1 {

  private static final int[] LAST = {1, 3, 7, 9};
  private final TreeSet<Z> mA = new TreeSet<>();
  private int mN = 0;

  @Override
  public Z next() {
    while (mA.isEmpty()) {
      ++mN;
      for (int d0 = 1; d0 < 10; ++d0) {
        for (final int d1 : LAST) {
          if (d1 != d0) {
            Z t = Z.ZERO;
            for (int m = mN; m > 0; --m) {
              for (int k = 0; k < m; ++k) {
                t = t.multiply(10).add(d0);
              }
              for (int k = 0; k < m; ++k) {
                t = t.multiply(10).add(d1);
              }
            }
            if (t.isProbablePrime()) {
              mA.add(t);
            }
          }
        }
      }
    }
    return mA.pollFirst();
  }
}

