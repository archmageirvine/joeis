package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A064631 a(n) = ceiling(log_2(A064630(n))).
 * @author Sean A. Irvine
 */
public class A064631 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    final Z t = Z.ONE.shiftLeft(2L * ++mN);
    final Z a = Z.THREE.pow(mN);
    final Z[] qr3 = t.divideAndRemainder(a);
    final Z[] qr2 = qr3[1].divideAndRemainder(Z.ONE.shiftLeft(mN));
    return Z.valueOf(qr3[0].add(qr2[0]).add(qr2[1]).bitLength());
  }
}
