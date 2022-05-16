package irvine.oeis.a099;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A099542 Rhonda numbers to base 10.
 * @author Georg Fischer
 */
public class A099542 implements Sequence {

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
    final long digProd = ZUtils.digitProduct(n, mBase);
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
