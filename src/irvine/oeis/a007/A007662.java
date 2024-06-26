package irvine.oeis.a007;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirectSequence;

/**
 * A007662 Quadruple factorial numbers n!!!!: a(n) = n*a(n-4).
 * @author Sean A. Irvine
 */
public class A007662 extends AbstractSequence implements DirectSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A007662(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A007662() {
    super(0);
  }

  private Z mA = Z.ONE;
  private Z mB = Z.ONE;
  private Z mC = Z.TWO;
  private Z mD = Z.THREE;
  private long mN = -1;

  @Override
  public Z next() {
    if (++mN <= 2) {
      return mN < 2 ? Z.ONE : Z.TWO;
    } else if (mN > 3) {
      final Z t = mA.multiply(mN);
      mA = mB;
      mB = mC;
      mC = mD;
      mD = t;
    }
    return mD;
  }

  @Override
  public Z a(final Z n) {
    return Functions.MULTIFACTORIAL.z(4, n);
  }

  @Override
  public Z a(final int n) {
    return Functions.MULTIFACTORIAL.z(4, n);
  }

}
