package irvine.oeis.a056;

import irvine.factor.factor.PrimeDivision;
import irvine.math.z.Z;
import irvine.oeis.a001.A001405;

/**
 * A056057 The largest square which divides n-th central binomial coefficient.
 * @author Sean A. Irvine
 */
public class A056057 extends A001405 {

  protected final PrimeDivision mFactor = new PrimeDivision();
  {
    super.next();
  }

  @Override
  public Z next() {
    final Z n = super.next();
    return n.divide(mFactor.factorize(n).core());
  }
}
