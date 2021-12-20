package irvine.oeis.a052;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a001.A001359;

/**
 * A052350 Smallest primes from A001359 where the distance (A053319) to the next similar twin increases.
 * @author Sean A. Irvine
 */
public class A052350 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    mN += 6;
    final Sequence seq = new A001359();
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
