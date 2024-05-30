package irvine.oeis.a001;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000120;

/**
 * A001511 The ruler function: exponent of the highest power of 2 dividing 2n. Equivalently,  the 2-adic valuation of 2n.
 * @author Sean A. Irvine
 */
public class A001511 extends Sequence1 implements DirectSequence {

  private final Sequence mSeq = new A000120();
  private Z mA = mSeq.next();

  @Override
  public Z next() {
    final Z t = mA;
    mA = mSeq.next();
    return Z.TWO.add(t).subtract(mA);
  }

  @Override
  public Z a(final int n) {
    return Functions.VALUATION.z(2L * n, 2);
  }

  @Override
  public Z a(final Z n) {
    return Functions.VALUATION.z(n.multiply2(), Z.TWO);
  }
}
