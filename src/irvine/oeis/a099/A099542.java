package irvine.oeis.a099;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A099542 Rhonda numbers to base 10.
 * @author Georg Fischer
 */
public class A099542 extends Sequence1 {

  private int mBase;
  protected Z mSopfr;
  private long mN = 0;

  /** Construct the sequence. */
  public A099542() {
    this(10);
  }

  /**
   * Generic constructor with parameters
   * @param base
   */
  public A099542(final int base) {
    mBase = base;
    mN = 1;
  }

  /**
   * Test the condition.
   * @param n current index
   * @return true if the condition is met, or false otherwise.
   */
  protected boolean isOk(final long n) {
    final long digProd = Functions.DIGIT_PRODUCT.l(mBase, n);
    if (digProd != 0 && digProd % mBase == 0) {
      mSopfr = Jaguar.factor(n).sopfr();
      if (mSopfr.multiply(mBase).equals(Z.valueOf(digProd))) {
        return true;
      }
    }
    return false;
  }

  @Override
  public Z next() {
    while (!isOk(++mN)) {
    }
    return Z.valueOf(mN);
  }
}
