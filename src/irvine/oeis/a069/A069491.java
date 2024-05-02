package irvine.oeis.a069;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a003.A003418;

/**
 * A069457.
 * @author Sean A. Irvine
 */
public class A069491 extends Sequence1 {

  private final Sequence mL = new A003418().skip();
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z lcm = mL.next();
    long k = 0;
    while (true) {
      final Z[] qr = lcm.divideAndRemainder(++k + mN);
      if (!qr[1].isZero()) {
        return lcm;
      }
      lcm = qr[0];
    }
  }
}

