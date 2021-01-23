package irvine.oeis.a000;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A050412 Riesl problem: start with n; repeatedly double and add 1 until reaching a prime. 
 * Sequence gives number of steps to reach a prime or 0 if no prime is ever reached.
 * @author Martin M. S. Pedersen
 */

public class A050412 implements Sequence {

  private long n = 0;
  protected final Fast mFast = new Fast();

  @Override
  public Z next() {
		long steps;
		Z candidate;

		n++;
		steps=0;
		candidate=new Z(n);

		do {
			candidate=candidate.multiply(Z.TWO).add(Z.ONE);
			steps++;
		}
		while (!mFast.isPrime(candidate));
		return new Z(steps);
  }
}

