package irvine.oeis.a128;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence2;
import irvine.oeis.a000.A000040;

/**
 * A128677 Least k&gt;p such that (kp)^3 divides (p-1)^(kp)^2+1 for prime p = A000040(n).
 * @author Sean A. Irvine
 */
public class A128677 extends Sequence2 {

  private final Sequence mPrimes = new A000040().skip();

  @Override
  public Z next() {
    final Z p = mPrimes.next();
    Z t = p.subtract(1).pow(p.square()).add(1);
    while (true) {
      final Z[] qr = t.divideAndRemainder(p);
      if (!qr[1].isZero()) {
        return Functions.LPF.z(t);
      }
      t = qr[0];
    }
  }
}
