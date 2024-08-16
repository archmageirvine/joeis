package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A030093 Primes p such that p, p^2 and p^3 all have the same set of digits.
 * @author Sean A. Irvine
 */
public class A030093 extends Sequence1 {

  private static final A030091 mSeq = new A030091();

  @Override
  public Z next() {
    while (true) {
      final Z p = mSeq.next();
      if (mSeq.isOk(p, p.pow(3))) {
        return p;
      }
    }
  }
}
