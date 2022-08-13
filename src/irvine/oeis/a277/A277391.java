package irvine.oeis.a277;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.q.Q;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.SequenceWithOffset;

/**
 * A277391 a(n) = n!*LaguerreL(n, -2*n).
 * a(n) = n! * Sum_{k=0..n} binomial(n, k) * 2^k * n^k / k!
 * @author Georg Fischer
 */
public class A277391 implements SequenceWithOffset {

  private int mN;
  private int mOffset;
  private int mParm;

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
    mOffset = offset;
    mN = offset - 1;
    mParm = parm;
  }

  @Override
  public int getOffset() {
    return mOffset;
  }

  @Override
  public Z next() {
    ++mN;
    Q sum = Q.ZERO;
    for (int k = 0; k <= mN; ++k) {
      sum = sum.add(new Q(Binomial.binomial(mN, k).multiply(Z.valueOf(mParm * mN).pow(k)), MemoryFactorial.SINGLETON.factorial(k)));
    }
    return sum.multiply(MemoryFactorial.SINGLETON.factorial(mN)).num();
  }
}
