package irvine.oeis.a007;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007816 Number of abstract simplicial 2-complexes on {1,2,3,...,n+3} which triangulate the 2-sphere: C(n+3,2)*(4n+1)!/(3n+3)!.
 * @author Sean A. Irvine
 */
public class A007816 implements Sequence {

  private int mN = 0;
  private Z mA = Z.ONE;
  private Z mB = Z.SIX;

  @Override
  public Z next() {
    ++mN;
    mA = mA.multiply(4 * mN + 1).multiply(4 * mN).multiply(4 * mN - 1).multiply(4 * mN - 2);
    mB = mB.multiply(3 * mN + 3).multiply(3 * mN + 2).multiply(3 * mN + 1);
    return Binomial.binomial(mN + 3, 2).multiply(mA).divide(mB);
  }
}
