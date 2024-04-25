package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.DirectSequence;
import irvine.oeis.a000.A000120;

/**
 * A001511 The ruler function: exponent of the highest power of 2 dividing 2n. Equivalently,  the 2-adic valuation of 2n.
 * @author Sean A. Irvine
 */
public class A001511 extends A000120 implements DirectSequence {

  /** Construct the sequence. */
  public A001511() {
    super(1);
  }

  private Z mA = super.next();

  @Override
  public Z next() {
    final Z t = mA;
    mA = super.next();
    return Z.TWO.add(t).subtract(mA);
  }

  @Override
  public Z a(final int n) {
    return Z.valueOf(Integer.numberOfTrailingZeros(2 * n));
  }

  @Override
  public Z a(final Z n) {
    return Z.valueOf(ZUtils.valuation(n.multiply2(), Z.TWO));
  }
}
