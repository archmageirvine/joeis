package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006564 Icosahedral numbers: <code>a(n) = n*(5*n^2 - 5*n + 2)/2</code>.
 * @author Sean A. Irvine
 */
public class A006564 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    return Z.FIVE.multiply(mN).subtract(5).multiply(mN).add(2).multiply(mN).divide2();
  }
}
