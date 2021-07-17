package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.HomePrimeSequence;
import irvine.oeis.Sequence;

/**
 * A048986 Home primes in base 2: primes reached when you start with n and (working in base 2) concatenate its prime factors (A048985); repeat until a prime is reached (or -1 if no prime is ever reached). Answer is written in base 10.
 * @author Sean A. Irvine
 */
public class A048986 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    final HomePrimeSequence hp = new HomePrimeSequence(mN, 2, true);
    Z p = null;
    Z q;
    while ((q = hp.next()) != null) {
      p = q;
    }
    return p;
  }
}

