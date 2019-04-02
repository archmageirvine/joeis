package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A014687 In sequence of odd primes add 1 to first prime, 3rd prime, 5th prime, ... then subtract 1 from 2nd prime, fourth prime, sixth prime and so on.
 * @author Sean A. Irvine
 */
public class A014687 extends A000040 {

  private long mSign = -1;
  {
    super.next();
  }

  @Override
  public Z next() {
    mSign = -mSign;
    return super.next().add(mSign);
  }
}
