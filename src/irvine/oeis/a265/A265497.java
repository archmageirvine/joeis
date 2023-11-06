package irvine.oeis.a265;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A265497 Numbers n such that n*2^127 - 1 is prime.
 * @author Georg Fischer
 */
public class A265497 extends AbstractSequence {

  private int mN;
  private final Z mP2;

  /** Construct the sequence. */
  public A265497() {
    this(1, 127);
  }

  /**
   * Generic constructor with parameters
   * @param offset first index
   * @param expon exponent of 2
   */
  public A265497(final int offset, final int expon) {
    super(offset);
    mN = offset - 1;
    mP2 = Z.ONE.shiftLeft(expon);
  }

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (mP2.multiply(mN).subtract(1).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
