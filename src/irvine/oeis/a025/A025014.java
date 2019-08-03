package irvine.oeis.a025;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A025013.
 * @author Sean A. Irvine
 */
public class A025014 implements Sequence {

  // After Doron Zeilberger

  private final Z[] mA = {Z.ONE, Z.ONE, Z.NINE, Z.valueOf(61), Z.valueOf(489)};
  private long mN = -1;

  @Override
  public Z next() {
    if (++mN < mA.length) {
      return mA[(int) mN];
    }
    final Z[] pn = new Z[5];
    pn[0] = Z.ONE;
    final long n = mN - 5;
    for (int k = 1; k < pn.length; ++k) {
      pn[k] = pn[k - 1].multiply(n);
    }
    final Z a0 = mA[0].multiply(6561).multiply(4 * n + 17).multiply(4 * n + 13).multiply(5 * n + 24).multiply(5 * n + 19).multiply(5 * n + 14).multiply(5 * n + 23).multiply(n + 4).multiply(n + 3).multiply(n + 2).multiply(n + 1);
    final Z a1 = mA[1].multiply(1458).multiply(5 * n + 24).multiply(5 * n + 19).multiply(4 * n + 17).multiply(5 * n + 9).multiply(4 * n + 9).multiply(5 * n + 18).multiply(2 * n + 9).multiply(n + 4).multiply(n + 3).multiply(n + 2);
    final Z a2 = mA[2].multiply(162).multiply(5 * n + 24).multiply(5 * n + 14).multiply(4 * n + 13).multiply(5 * n + 23).multiply(n + 4).multiply(n + 3).multiply(pn[4].multiply(1020).add(pn[3].multiply(12291)).add(pn[2].multiply(53378)).add(pn[1].multiply(98617)).add(65610));
    final Z a3 = mA[3].multiply(18).multiply(4 * n + 17).multiply(4 * n + 9).multiply(5 * n + 19).multiply(2 * n + 9).multiply(5 * n + 9).multiply(5 * n + 18).multiply(n + 4).multiply(pn[3].multiply(385).add(pn[2].multiply(4158)).add(pn[1].multiply(14551)).add(16610));
    final Z a4 = mA[4].multiply(5 * n + 23).multiply(4 * n + 13).multiply(4 * n + 9).multiply(5 * n + 24).multiply(5 * n + 14).multiply(5 * n + 9).multiply(pn[4].multiply(2101).add(pn[3].multiply(33616)).add(pn[2].multiply(201391)).add(pn[1].multiply(535416)).add(532980));
    final Z u = a4.add(a3).subtract(a2).subtract(a1).add(a0);
    final Z t = u.divide(Z.EIGHT.multiply(4 * n + 19).multiply(5 * n + 19).multiply(5 * n + 14).multiply(5 * n + 9).multiply(2 * n + 9).multiply(4 * n + 17).multiply(4 * n + 13).multiply(4 * n + 9).multiply(5 * n + 18).multiply(n + 5));
    System.arraycopy(mA, 1, mA, 0, mA.length - 1);
    mA[mA.length - 1] = t;
    return t;
  }
}
