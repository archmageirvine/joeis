package irvine.oeis.a001;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001683 Number of one-sided triangulations of the disk; or flexagons of order n; or unlabeled plane trivalent trees <code>(n-2</code> internal vertices, all of degree 3 and hence <code>n leaves)</code>.
 * @author Sean A. Irvine
 */
public class A001683 implements Sequence {

  long mN = 1;

  @Override
  public Z next() {
    ++mN;
    Z c = Binomial.catalan(mN - 2).multiply(6).divide(mN);
    if ((mN & 1) == 0) {
      c = c.add(Binomial.catalan(mN / 2 - 1).multiply(3));
    }
    if (mN % 3 == 0) {
      c = c.add(Binomial.catalan(mN / 3 - 1).shiftLeft(2));
    }
    return c.divide(6);
  }
}
