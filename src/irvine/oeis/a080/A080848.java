package irvine.oeis.a080;

import irvine.math.z.Z;
import irvine.oeis.a008.A008683;

/**
 * A080848 a(n) = n*(mu(n)+2), where mu is the Moebius function (A008683).
 * @author Georg Fischer
 */
public class A080848 extends A008683 {

  private int mN = 0;

  @Override
  public Z next() {
    return super.next().add(2).multiply(++mN);
  }
}
