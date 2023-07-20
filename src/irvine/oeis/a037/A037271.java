package irvine.oeis.a037;

import irvine.math.z.Z;
import irvine.oeis.prime.HomePrimeSequence;
import irvine.oeis.a002.A002808;

/**
 * A037271 Number of steps to reach a prime under "replace n with concatenation of its prime factors" when applied to n-th composite number, or -1 if no such number exists.
 * @author Sean A. Irvine
 */
public class A037271 extends A002808 {

  @Override
  public Z next() {
    final Z n = super.next();
    final HomePrimeSequence hp = new HomePrimeSequence(n.longValueExact());
    long c = -1;
    while (hp.next() != null) {
      ++c;
    }
    return Z.valueOf(c);
  }
}

