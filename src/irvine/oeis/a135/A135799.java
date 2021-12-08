package irvine.oeis.a135;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.a000.A000757;

/**
 * A135799 Second column (k=1) of triangle A134832 (circular succession numbers).
 * a(n) = binomial((col-1)*n + (col-1), col-1)*A000757(n), col=2.
 * @author Georg Fischer
 */
public class A135799 extends A000757 {

  protected int mN;
  protected int mK;

  /** Construct the sequence. */
  public A135799() {
    this(2);
  }

  /**
   * Generic constructor with parameter
   * @param col column number.
   */
  public A135799(final int col) {
    mN = -1;
    mK = col - 1;
  }

  @Override
  public Z next() {
    ++mN;
    return Binomial.binomial(mN + mK, mK).multiply(super.next());
  }
}
