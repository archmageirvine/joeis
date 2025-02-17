package irvine.oeis.a075;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000142;

/**
 * A070428.
 * @author Sean A. Irvine
 */
public class A075354 extends Sequence1 {

  private final Sequence mFactorials = new A000142().skip();
  private long mN = 1;

  @Override
  public Z next() {
    final Z f = mFactorials.next();
    Z prod = Z.ONE;
    while (prod.compareTo(f) < 0) {
      prod = prod.multiply(++mN);
    }
    return Z.valueOf(mN);
  }
}
