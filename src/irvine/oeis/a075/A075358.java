package irvine.oeis.a075;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000142;

/**
 * A075358 a(n) = smallest (n+1)(n+2)...(n+k) that is &gt;= n!.
 * @author Sean A. Irvine
 */
public class A075358 extends Sequence1 {

  private final Sequence mFactorials = new A000142().skip();
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    final Z f = mFactorials.next();
    Z prod = Z.ONE;
    long k = 0;
    while (prod.compareTo(f) < 0) {
      prod = prod.multiply(mN + ++k);
    }
    return prod;
  }
}
