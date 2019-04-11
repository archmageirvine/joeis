package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A014686 In sequence of prime numbers add 1 to first prime, 3rd prime, fifth prime, <code>...</code> then subtract 1 from 2nd prime, fourth prime, sixth prime and so on.
 * @author Sean A. Irvine
 */
public class A014686 extends A000040 {

  private long mSign = -1;

  @Override
  public Z next() {
    mSign = -mSign;
    return super.next().add(mSign);
  }
}
