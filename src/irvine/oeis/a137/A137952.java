package irvine.oeis.a137;

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A137952 G.f. satisfies A(x) = 1 + x*(1 + x*A(x)^3)^2.
 * @author Georg Fischer
 */
public class A137952 implements Sequence {

  private int mN;
  private final long mParm1;
  private final long mParm2;

  /** Construct the sequence. */
  public A137952() {
    this(2, 3);
  }

  /**
   * Generic constructor with parameters.
   * @param parm1 first parameter
   * @param parm2 second parameter
   */
  public A137952(final int parm1, final int parm2) {
    mParm1 = parm1;
    mParm2 = parm2;
    mN = -1;
  }

  @Override
  public Z next() {
    ++mN;
    if (mN == 0) {
      return Z.ONE;
    }
    return Integers.SINGLETON.sum(0, mN - 1, k -> Binomial.binomial(mParm1 * (mN - k), k).multiply(Binomial.binomial(mParm2 * k, mN - k - 1)).divide(mN - k));
  }
}
