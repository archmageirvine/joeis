package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.a000.A000598;

/**
 * A010373 Number of unrooted quartic trees with <code>2n</code> (unlabeled) nodes and possessing a bicentroid; number of 2n-carbon alkanes C(2n)H(4n+2) with a bicentroid, ignoring stereoisomers.
 * @author Sean A. Irvine
 */
public class A010373 extends A000598 {

  {
    super.next();
  }

  @Override
  public Z next() {
    final Z b = super.next();
    return b.multiply(b.add(1)).divide2();
  }
}
