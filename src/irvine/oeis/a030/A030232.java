package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a027.A027423;

/**
 * A030232 Number of divisors of n! divides the number of divisors of (2n)!.
 * @author Sean A. Irvine
 */
public class A030232 extends A027423 {

  private final Sequence mA = new A027423();
  private long mN = 0;
  {
    mA.next();
    super.next();
  }
  
  @Override
  public Z next() {
    while (true) {
      ++mN;
      mA.next();
      if (mA.next().mod(super.next()).isZero()) {
        return Z.valueOf(mN);
      }
    }
  }
}
