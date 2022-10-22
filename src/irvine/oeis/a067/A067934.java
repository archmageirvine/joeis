package irvine.oeis.a067;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A067934 Let rep(k) = (10^k - 1)/9 be the k-th repunit number = 11111..1111 with k 1 digits, then sequence gives values of k such that rep(k) == 1 (mod k).
 * @author Georg Fischer
 */
public class A067934 extends AbstractSequence {

  private Z mN;
  private Z mRepN; // rep(n)
  private final Z mRepp; // rep(parm)

  /** Construct the sequence. */
  public A067934() {
    this(1, 1);
  }

  /**
   * Generic constructor with parameters
   * @param parm modulus parameter
   * @param offset first index
   */
  public A067934(final int offset, final int parm) {
    super(offset);
    mN = Z.ZERO;
    mRepN = Z.ONE;
    mRepp = Z.TEN.pow(parm).subtract(1).divide(Z.NINE);
  }

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (mRepN.mod(mN).equals(mRepp.mod(mN))) {
        mRepN = mRepN.multiply(10).add(1);
        return mN;
      }
      mRepN = mRepN.multiply(10).add(1);
    }
  }
}
