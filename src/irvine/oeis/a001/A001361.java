package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001361 Number of points in interior of n-th crystal ball in E_8 lattice.
 * @author Sean A. Irvine
 */
public class A001361 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    Z n = Z.valueOf(++mN);
    Z s = n.multiply(24).add(7);
    n = n.multiply(mN);
    s = s.add(n.multiply(300));
    n = n.multiply(mN);
    s = s.subtract(n.multiply(252));
    n = n.multiply(mN);
    s = s.add(n.multiply(273));
    n = n.multiply(mN);
    s = s.subtract(n.multiply(504));
    n = n.multiply(mN);
    s = s.add(n.multiply(210));
    n = n.multiply(mN);
    s = s.subtract(n.multiply(108));
    n = n.multiply(mN);
    s = s.add(n.multiply(57));
    return s.divide(7);
  }
}
