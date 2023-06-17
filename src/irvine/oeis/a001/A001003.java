package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A001003 Schroeder's second problem (generalized parentheses); also called super-Catalan numbers or little Schroeder numbers.
 * @author Sean A. Irvine
 */
public class A001003 extends AbstractSequence {

  /** Construct the sequence. */
  public A001003() {
    super(0);
  }

  protected int mN = -1;
  private Z mA = Z.ONE;
  private Z mB = Z.ONE;

  @Override
  public Z next() {
    if (++mN < 2) {
      return Z.ONE;
    }
    final Z t = mB.multiply(6L * mN - 3)
      .subtract(mA.multiply(mN - 2L))
      .divide(mN + 1L);
    mA = mB;
    mB = t;
    return t;
  }
}
