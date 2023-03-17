package irvine.oeis.a080;

import irvine.math.z.Z;
import irvine.oeis.a008.A008683;

/**
 * A080849 (mu(n)+2)*n^2, where mu is the Moebius function (A008683).
 * @author Georg Fischer
 */
public class A080849 extends A008683 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    return super.next().add(2).multiply(mN * mN);
  }
}
