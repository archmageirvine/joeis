package irvine.oeis.a056;

import irvine.factor.factor.PrimeDivision;
import irvine.math.z.Z;
import irvine.oeis.a001.A001405;

/**
 * A056058 Squarefree part of the n-th central binomial coefficient.
 * @author Sean A. Irvine
 */
public class A056058 extends A001405 {

  /** Construct the sequence. */
  public A056058() {
    super(1);
  }

  private final PrimeDivision mFactor = new PrimeDivision();

  {
    super.next();
  }

  @Override
  public Z next() {
    final Z n = super.next();
    return mFactor.factorize(n).core();
  }
}
