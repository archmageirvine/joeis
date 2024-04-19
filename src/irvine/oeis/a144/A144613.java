package irvine.oeis.a144;

import irvine.math.z.Z;
import irvine.oeis.a000.A000203;

/**
 * A144613 a(n) = sigma(3*n) = A000203(3*n).
 * @author Georg Fischer
 */
public class A144613 extends A000203 {

  protected int mN = 0;
  private final int mMult;

  /** Construct the sequence. */
  public A144613() {
    this(3);
  }

  /**
   * Generic constructor with parameters
   * @param mult
   */
  public A144613(final int mult) {
    mMult = mult;
  }

  @Override
  public Z next() {
    ++mN;
    for (int i = mMult; i > 1; --i) {
      super.next();
    }
    return super.next();
  }
}
