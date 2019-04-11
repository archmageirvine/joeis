package irvine.oeis.a215;

import irvine.math.z.Z;
import irvine.oeis.a001.A001608;

/**
 * A215339 <code>a(n) =</code> A001608(n) <code>mod n</code>.
 * @author Sean A. Irvine
 */
public class A215339 extends A001608 {

  protected Z mN = Z.ZERO;
  {
    super.next();
  }

  @Override
  public Z next() {
    mN = mN.add(1);
    return super.next().mod(mN);
  }
}
