package irvine.oeis.a059;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A059111 a(n) = floor(prime(n) - n*log(n)).
 * @author Sean A. Irvine
 */
public class A059111 extends A000040 {

  private long mN = 0;

  @Override
  public Z next() {
    return super.next().subtract(CR.valueOf(++mN).log().multiply(mN).ceil());
  }
}

