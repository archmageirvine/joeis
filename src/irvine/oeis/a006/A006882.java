package irvine.oeis.a006;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirectSequence;

/**
 * A006882 Double factorials n!!: a(n) = n*a(n-2) for n &gt; 1, a(0) = a(1) = 1.
 * @author Sean A. Irvine
 */
public class A006882 extends AbstractSequence implements DirectSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A006882(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A006882() {
    super(0);
  }

  private long mN = -1;
  private Z mA = Z.ONE;
  private Z mB = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 1) {
      final Z t = mA.multiply(mN);
      mA = mB;
      mB = t;
    }
    return mB;
  }

  @Override
  public Z a(final Z n) {
    return Functions.MULTIFACTORIAL.z(2, n);
  }

  @Override
  public Z a(final int n) {
    return Functions.MULTIFACTORIAL.z(2, n);
  }

}
