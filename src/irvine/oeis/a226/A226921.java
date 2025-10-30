package irvine.oeis.a226;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A226921 Values of n such that L(1) and N(1) are both prime, where L(k) = (n^2+n+1)*2^(2*k) + (2*n+1)*2^k + 1, N(k) = (n^2+n+1)*2^k + n.
 * @author Georg Fischer
 */
public class A226921 extends AbstractSequence {

  private int mN;
  private int mK;

  /** Construct the sequence. */
  public A226921() {
    this(1, 1);
  }

  private Z fL(final int n, final int k) {
    final Z result = Z.valueOf(n + 1).multiply(n).add(1).multiply(Z.ONE.shiftLeft(2 * k)).add(Z.ONE.shiftLeft(k).multiply(2 * n + 1)).add(1);
    // System.out.print("L(" + n + "," + k + ")=" + result +"; ");
    return result;
  }

  private Z fN(final int n, final int k) {
    final Z result = Z.valueOf(n + 1).multiply(n).add(1).multiply(Z.ONE.shiftLeft(k)).add(n);
    // System.out.print("N(" + n + "," + k + ")=" + result +"; ");
    return result;
  }

  private boolean isOk(final int n) {
    return Predicates.PRIME.is(fL(n, mK)) && Predicates.PRIME.is(fN(n, mK));
  }

  /**
   * Generic constructor with parameters
   * @param offset first index
   * @param k second parameter of L and N
   */
  public A226921(final int offset, final int k) {
    super(offset);
    mN = 0;
    mK = k;
  }

  @Override
  public Z next() {
    if (mN == 0) {
      mN = -1;
      return Z.ZERO;
    }
    while (true) {
      // k=-k+(k<0))
      if (isOk(mN)) {
        final Z result = Z.valueOf(mN);
        // System.out.print(" mN=" + mN);
        mN = mN > 0 ? -(mN + 2) : -mN;
        // System.out.println(" -> " + mN + ", result=" + result);
        return result;
      }
      // System.out.print(" mN=" + mN);
      mN = mN > 0 ? -(mN + 2) : -mN;
      // System.out.println(" -> " + mN + " - notOk");
    }
  }
}
