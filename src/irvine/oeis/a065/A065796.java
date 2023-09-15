package irvine.oeis.a065;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000290;

/**
 * A065796 Alternating sum of digits of n^2.
 * @author Sean A. Irvine
 */
public class A065796 extends Sequence1 {

  private final Sequence mSquare = new A000290().skip();

  @Override
  public Z next() {
    Z m = mSquare.next();
    long sum = 0;
    while (!m.isZero()) {
      sum += m.mod(10);
      m = m.divide(10).negate();
    }
    return Z.valueOf(sum);
  }
}
