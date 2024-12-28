package irvine.oeis.a073;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a002.A002110;

/**
 * A073917 Smallest prime which leaves a remainder 1 when divided by primorial(n), i.e., when divided by first n primes.
 * @author Sean A. Irvine
 */
public class A073917 extends Sequence1 {

  private final Sequence mPrimorial = new A002110().skip();

  @Override
  public Z next() {
    final Z p = mPrimorial.next();
    Z q = Z.ONE;
    while (!q.isProbablePrime()) {
      q = q.add(p);
    }
    return q;
  }
}

