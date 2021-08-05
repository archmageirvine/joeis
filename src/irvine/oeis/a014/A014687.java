package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.a065.A065091;

/**
 * A014687 In sequence of odd primes add 1 to first prime, 3rd prime, 5th prime, ... then subtract 1 from 2nd prime, fourth prime, sixth prime and so on.
 * @author Sean A. Irvine
 */
public class A014687 extends A065091 {

  private long mSign = -1;

  @Override
  public Z next() {
    mSign = -mSign;
    return super.next().add(mSign);
  }
}
