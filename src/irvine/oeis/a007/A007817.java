package irvine.oeis.a007;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A007817 Number of abstract simplicial 2-complexes on {1, 2, 3,...,n+4} which triangulate a Moebius band in such a way that all vertices lie on the boundary and are traversed in the order 1, 2, 3,... as one goes around the boundary.
 * @author Sean A. Irvine
 */
public class A007817 extends AbstractSequence {

  /** Construct the sequence. */
  public A007817() {
    super(5);
  }

  private int mN = 4;
  private Z mA = Z.valueOf(64);

  @Override
  public Z next() {
    ++mN;
    mA = mA.shiftLeft(2);
    return mA.subtract(Z.valueOf(mN).multiply(29).subtract(77).multiply(mN).add(106).multiply(mN).subtract(88)
      .multiply(Binomial.binomial(2 * mN - 5, mN - 1)).multiply2()
      .divide(mN + 2).divide(mN + 1).divide(mN - 3));
  }
}
