package irvine.oeis.a038;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A038759 a(n) = ceiling(sqrt(n))*floor(sqrt(n)).
 * @author Sean A. Irvine
 */
public class A038759 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    final Z[] qr = mN.sqrtAndRemainder();
    if (Z.ZERO.equals(qr[1])) {
      return mN;
    } else {
      return qr[0].multiply(qr[0].add(1));
    }
  }
}
