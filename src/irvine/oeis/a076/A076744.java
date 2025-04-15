package irvine.oeis.a076;

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A076744 This sequence with the appropriate denominator (product of (2*3^k-3) k=0..n) produces the expected length of shortest nonintersecting path through n points on a Sierpi\u0144ski Gasket from corner to corner.
 * @author Sean A. Irvine
 */
public class A076744 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    final Z prod = Integers.SINGLETON.product(0, mN, k -> Z.THREE.pow(k).multiply(2).subtract(3));
    return Integers.SINGLETON.sum(0, mN, k -> prod.multiply(Binomial.binomial(mN, k)).multiply(Z.NEG_ONE.pow(k)).divide(Z.THREE.pow(k).multiply(2).subtract(3)));
  }
}
