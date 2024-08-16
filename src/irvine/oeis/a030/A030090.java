package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A030090 Primes such that digits of p do not appear in p^2 or p^3 (probably finite).
 * @author Sean A. Irvine
 */
public class A030090 extends Sequence1 {

  private static final A030086 mSeq = new A030086();

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

