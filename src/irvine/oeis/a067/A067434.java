package irvine.oeis.a067;

import irvine.factor.factor.PrimeDivision;
import irvine.math.z.Z;
import irvine.oeis.a000.A000984;

/**
 * A067434 Number of distinct prime factors in binomial(2*n,n).
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A067434 extends A000984 {

  private final PrimeDivision mFactor = new PrimeDivision();

  /** Construct the sequence. */
  public A067434() {
    super(1);
    super.next();
  }

  @Override
  public Z next() {
    return Z.valueOf(mFactor.factorize(super.next()).omega());
  }
}
