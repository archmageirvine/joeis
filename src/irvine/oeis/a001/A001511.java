package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.a000.A000120;

/**
 * A001511 The ruler function: exponent of the highest power of 2 dividing 2n. Equivalently,  the 2-adic valuation of 2n.
 * @author Sean A. Irvine
 */
public class A001511 extends A000120 {

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
}
