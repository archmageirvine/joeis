package irvine.oeis.a274;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A274022 Primes of the form 2^(2^n) + 3.
 * @author Georg Fischer
 */
public class A274022 extends AbstractSequence {

  private int mK;
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
    super(offset);
    mK = kStart - 1;
    mAdd = add;
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
