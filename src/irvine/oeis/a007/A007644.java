package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.a004.A004051;

/**
 * A007644 Primes not of form <code>| 3^a +- 2^b |</code> where a, b are nonnegative integers.
 * @author Sean A. Irvine
 */
public class A007644 extends A007643 {

  private A004051 mSeq = new A004051();
  private Z mA = mSeq.next();

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      while (p.compareTo(mA) > 0) {
        mA = mSeq.next();
      }
      if (!p.equals(mA)) {
        return p;
      }
    }
  }
}

