package irvine.oeis.a052;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a031.A031938;

/**
 * A052359 First prime of A031938 (lesser of primes differing by 20) whose distance to the next 20-twin increases.
 * @author Sean A. Irvine
 */
public class A052359 extends Sequence1 {

  private long mN = 18;

  @Override
  public Z next() {
    mN += 6;
    final Sequence seq = new A031938();
    Z p = seq.next();
    while (true) {
      final Z q = p;
      p = seq.next();
      if (p.subtract(q).longValueExact() == mN) {
        return q;
      }
    }
  }
}
