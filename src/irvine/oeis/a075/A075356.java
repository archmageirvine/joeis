package irvine.oeis.a075;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000142;

/**
 * A070428.
 * @author Sean A. Irvine
 */
public class A075356 extends Sequence1 {

  private final Sequence mFactorials = new A000142().skip();
  private long mN = 0;

  @Override
  public Z next() {
    final Z f = mFactorials.next();
    Z prod = Z.valueOf(++mN);
    long sum = mN;
    while (prod.compareTo(f) < 0) {
      prod = prod.multiply(++mN);
      sum += mN;
    }
    return Z.valueOf(sum);
  }
}
