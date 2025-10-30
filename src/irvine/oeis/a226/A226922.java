package irvine.oeis.a226;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A226922 Values of n such that L(2) and N(2) are both prime, where L(k) = (n^2+n+1)*2^(2*k) + (2*n+1)*2^k + 1, N(k) = (n^2+n+1)*2^k + n.
 * @author Georg Fischer
 */
public class A226922 extends AbstractSequence {

  private int mN;
  private int mK;

  /** Construct the sequence. */
  public A226922() {
    this(1, 2);
  }

  private Z fL(final int n, final int k) {
    return Z.valueOf(n + 1).multiply(n).add(1).multiply(Z.ONE.shiftLeft(2 * k)).add(Z.ONE.shiftLeft(k).multiply(2 * n + 1)).add(1);
  }

  private Z fN(final int n, final int k) {
    return Z.valueOf(n + 1).multiply(n).add(1).multiply(Z.ONE.shiftLeft(k)).add(n);
  }

  private boolean isOk(final int n) {
    return Predicates.PRIME.is(fL(n, mK)) && Predicates.PRIME.is(fN(n, mK));
  }

  /**
   * Generic constructor with parameters
   * @param offset first index
   * @param k second parameter of L and N
   */
  public A226922(final int offset, final int k) {
    super(offset);
    mN = -1;
    mK = k;
  }

  @Override
  public Z next() {
    while (true) {
      // k=-k+(k<0))
      if (isOk(mN)) {
        final Z result = Z.valueOf(mN);
        mN = mN > 0 ? -(mN + 2) : -mN;
        return result;
      }
      mN = mN > 0 ? -(mN + 2) : -mN;
    }
  }
}
