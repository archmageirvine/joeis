package irvine.oeis.a068;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A068645 Primes in which a string of 3's is sandwiched between two 1's.
 * @author Georg Fischer
 */
public class A068645 extends AbstractSequence {

  private int mAdd1; // add this to the last digit before shift
  private int mAdd2; // add this to the last digit after shift
  private Z mTerm;

  /** Construct the sequence. */
  public A068645() {
    this(1, 3, 1);
  }

  /**
   * Generic constructor with parameters
   * @param offset first index
   * @param inner middle digit
   * @param outer surrounding digit
   */
  public A068645(final int offset, final int inner, final int outer) {
    super(offset);
    mAdd1 = inner - outer;
    mAdd2 = outer;
    mTerm = Z.valueOf(outer - mAdd1);
  }

  @Override
  public Z next() {
    while (true) {
      mTerm = mTerm.add(mAdd1).multiply(Z.TEN).add(mAdd2);
      if (mTerm.isProbablePrime()) {
        return mTerm;
      }
    }
  }
}
