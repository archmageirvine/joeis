package irvine.oeis.a052;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a031.A031936;

/**
 * A052358 First prime from A031936 (lesser of 18-twin primes) whose distance to the next 18-twin increases.
 * @author Sean A. Irvine
 */
public class A052358 extends Sequence1 {

  private long mN = 16;

  @Override
  public Z next() {
    mN += 2;
    final Sequence seq = new A031936();
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
