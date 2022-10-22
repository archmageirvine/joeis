package irvine.oeis.a116;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A116611 Positive integers n such that 13^n == 5 (mod n).
 * @author Georg Fischer
 */
public class A116611 extends AbstractSequence {

  private int mK;
  private final Z mBase;
  private final int mResidue;

  /** Construct the sequence. */
  public A116611() {
    this(1, 13, 5);
  }

  /**
   * Generic constructor with parameters
   * @param offset first index
   * @param base base to be raised to the n-th power
   * @param residue residue
   */
  public A116611(final int offset, final int base, final int residue) {
    super(offset);
    mK = 0;
    mBase = Z.valueOf(base);
    mResidue = residue;
  }

  @Override
  public Z next() {
    while (true) {
      ++mK;
      final Z k = Z.valueOf(mK);
      int r = mResidue % mK;
      if (r < 0) {
        r += mK;
      }
      if (mBase.modPow(k, k).intValue() == r) {
        return k;
      }
    }
  }
}
