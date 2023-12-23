package irvine.oeis.a067;

import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067583 Integers of the form phi(n^n)/phi(n)^n where phi is the Euler totient function A000010(n).
 * @author Sean A. Irvine
 */
public class A067583 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final Z a = Euler.phi(Z.valueOf(++mN).pow(mN));
      final Z b = Euler.phi(mN).pow(mN);
      final Z[] qr = a.divideAndRemainder(b);
      if (qr[1].isZero()) {
        return qr[0];
      }
    }
  }
}
