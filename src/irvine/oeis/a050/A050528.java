package irvine.oeis.a050;

import irvine.math.z.Z;
import irvine.oeis.SequenceWithOffset;

/**
 * A050528 Primes of the form 9*2^n+1.
 * @author Sean A. Irvine
 * @author Georg Fischer
 */
public class A050528 implements SequenceWithOffset {

  private int mN;
  private int mOffset;
  private int mBase;
  private int mAdd;
  private Z mM;

  /** Construct the sequence. */
  public A050528() {
    this(0, 9, 2, 1);
  }

  /**
   * Generic constructor with parameters
   * @param offset first index
   * @param mult multiplicative parameter
   * @param base number base
   * @param add additive parameter
   */
  public A050528(final int offset, final int mult, final int base, final int add) {
    mOffset = offset;
    mBase = base;
    mAdd = add;
    mN = offset - 1;
    mM = Z.valueOf(mult);
  }

  @Override
  public int getOffset() {
    return mOffset;
  }

  @Override
  public Z next() {
    while (true) {
      final Z t = mM.add(mAdd);
      mM = mBase == 2 ? mM.shiftLeft(1) : mM.multiply(mBase);
      if (t.isProbablePrime()) {
        return t;
      }
    }
  }
}
