package irvine.oeis.a031;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A031997 Odd numbers which when cubed give number composed just of the digits <code>0, 1, 2, 3</code>.
 * @author Sean A. Irvine
 */
public class A031997 implements Sequence {

  private Z mN = Z.NEG_ONE;

  private boolean is0123(Z n) {
    while (!Z.ZERO.equals(n)) {
      final Z[] qr = n.divideAndRemainder(Z.TEN);
      if (qr[1].compareTo(Z.THREE) > 0) {
        return false;
      }
      n = qr[0];
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(2);
      if (is0123(mN.pow(3))) {
        return mN;
      }
    }
  }
}
