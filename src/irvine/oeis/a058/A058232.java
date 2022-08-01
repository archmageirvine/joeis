package irvine.oeis.a058;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A058232 a(n) = (a(n-1)a(n-5) + a(n-2)a(n-4) + a(n-3)^2)/a(n-6).
 * @author Sean A. Irvine
 */
public class A058232 implements Sequence {

  private static final long[] INIT = {0, 1, 0, 1, 1, -1, -1, 0, 0, 1, -1, -1, -1, -2, 1};
  private final Z[] mA = new Z[INIT.length];

  @Override
  public Z next() {
    if (mA[mA.length - 1] == null) {
      int k = mA.length - 1;
      while (k > 0 && mA[k - 1] == null) {
        --k;
      }
      mA[k] = Z.valueOf(INIT[k]);
      return mA[k];
    }
    final Z t = mA[mA.length - 1].multiply(mA[mA.length - 5]).add(mA[mA.length - 2].multiply(mA[mA.length - 4])).add(mA[mA.length - 3].square()).divide(mA[mA.length - 6]);
    System.arraycopy(mA, 1, mA, 0, mA.length - 1);
    mA[mA.length - 1] = t;
    return t;
  }
}
