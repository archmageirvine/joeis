package irvine.oeis.a274;

import irvine.math.z.Z;
import irvine.oeis.SequenceWithOffset;

/**
 * A274022 Primes of the form 2^(2^n) + 3.
 * @author Georg Fischer
 */
public class A274022 implements SequenceWithOffset {

  private int mK;
  private final int mOffset;
  private final int mAdd;

  /** Construct the sequence. */
  public A274022() {
    this(1, 0, 3);
  }

  /**
   * Generic constructor with parameters
   * @param offset first index
   * @param kStart first exponent k
   * @param add additive term
   */
  public A274022(final int offset, final int kStart, final int add) {
    mK = kStart - 1;
    mOffset = offset;
    mAdd = add;
  }

  @Override
  public int getOffset() {
    return mOffset;
  }

  @Override
  public Z next() {
    while (true) {
      final Z t = Z.ONE.shiftLeft(1 << ++mK).add(mAdd);
      if (t.isProbablePrime()) {
        return t;
      }
    }
  }
}
