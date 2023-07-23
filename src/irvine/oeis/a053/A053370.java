package irvine.oeis.a053;

import irvine.math.group.QuadraticFieldUtils;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a039.A039955;

/**
 * A053370 Write fundamental unit for real quadratic field of discriminant n as x + y*omega; sequence gives values of x for n == 1 mod 4.
 * @author Sean A. Irvine
 */
public class A053370 extends AbstractSequence {

  private final A039955 mSeq1 = new A039955();

  /** Construct the sequence. */
  public A053370() {
    super(0);
  }

  {
    mSeq1.next();
  }

  @Override
  public Z next() {
    final Z[] unit = QuadraticFieldUtils.fundamentalUnitPair(mSeq1.next());
    return unit[0].subtract(unit[1]).divide2();
  }
}
