package irvine.oeis.a059;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A059112 floor(prime(n) - n*log(n) - n*log(log(n)) + n).
 * @author Sean A. Irvine
 */
public class A059112 extends A000040 {

  private long mN = 1;
  {
    super.next(); // skip 2
  }

  @Override
  public Z next() {
    final CR log = CR.valueOf(++mN).log();
    return super.next().add(mN).subtract(log.multiply(mN).add(log.log().multiply(mN)).ceil());
  }
}

