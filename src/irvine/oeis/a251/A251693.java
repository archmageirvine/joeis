package irvine.oeis.a251;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A251693 a(n) = (n+1) * (2*n+1)^(n-2) * 3^n.
 * @author Georg Fischer
 */
public class A251693 extends Sequence0 {

  protected int mMult;
  protected int mN;

  /** Construct the sequence. */
  public A251693() {
    this(1);
  }

  /**
   * Generic constructor with parameters
   * @param mult factor in the formula
   */
  public A251693(final int mult) {
    mN = -1;
    mMult = mult;
  }

  @Override
  public Z next() {
    ++mN;
    if (mN == 0) {
      return Z.ONE;
    } else if (mN == 1) {
      return Z.valueOf(mMult + 1);
    }
    return Z.valueOf(mMult * mN + 1).multiply(Z.valueOf((mMult + 1) * mN + 1).pow(mN - 2)).multiply(Z.valueOf(mMult + 2).pow(mN));
  }
}
