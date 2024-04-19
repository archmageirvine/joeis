package irvine.oeis.a277;

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A277391 a(n) = n!*LaguerreL(n, -2*n).
 * a(n) = n! * Sum_{k=0..n} binomial(n, k) * 2^k * n^k / k!
 * @author Georg Fischer
 */
public class A277391 extends AbstractSequence {

  private int mN;
  private final long mParm;

  /** Construct the sequence. */
  public A277391() {
    this(0, 2);
  }

  /**
   * Generic constructor with parameters
   * @param offset first index
   * @param parm parameter
   */
  public A277391(final int offset, final int parm) {
    super(offset);
    mN = offset - 1;
    mParm = parm;
  }

  @Override
  public Z next() {
    ++mN;
    Q sum = Q.ZERO;
    for (int k = 0; k <= mN; ++k) {
      sum = sum.add(new Q(Binomial.binomial(mN, k).multiply(Z.valueOf(mParm * mN).pow(k)), Functions.FACTORIAL.z(k)));
    }
    return sum.multiply(Functions.FACTORIAL.z(mN)).num();
  }
}
