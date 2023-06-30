package irvine.oeis.a212;
// manually

import java.util.ArrayList;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A212846 Polylogarithm li(-n,-1/2) multiplied by (3^(n+1))/2.
 * a(n+1) = -(p+q)*a(n) + q*sum(k=0..n, binomial(n,k)*a(k)*a(n-k) ), with a(0) = 1.
 * @author Georg Fischer
 */
public class A212846 extends AbstractSequence {

  private final ArrayList<Z> mArr;
  private int mPQ;
  private int mQ;
  private int mN;

  /** Construct the sequence. */
  public A212846() {
    this(1, 2);
  }

  /**
   * Generic constructor with parameters
   * @param p numerator
   * @param q denominator
   */
  public A212846(final int p, final int q) {
    super(0);
    mArr = new ArrayList<>();
    mPQ = p + q; // 3
    mQ = q; // 2
    mArr.add(Z.ONE);
    mN = -1;
  }

  @Override
  public Z next() {
    ++mN;
    if (mN == 0) {
      return mArr.get(mN);
    }
    final int n = mN - 1;
    Z sum = Z.ZERO;
    for (int k = 0; k <= n; ++k) {
      sum = sum.add(Binomial.binomial(n, k).multiply(mArr.get(k)).multiply(mArr.get(n - k)));
    }
    final Z result = sum.multiply(mQ).subtract(mArr.get(n).multiply(mPQ));
    mArr.add(result);
    return result;
  }
}
