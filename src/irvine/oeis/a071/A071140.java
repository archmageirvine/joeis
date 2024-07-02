package irvine.oeis.a071;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.ComplementSequence;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000961;

/**
 * A071140 Numbers n such that sum of distinct primes dividing n is divisible by largest prime dividing n; n is neither a prime, nor a true power of prime.
 * @author Sean A. Irvine
 */
public class A071140 extends Sequence1 {

  private final Sequence mA = new ComplementSequence(1, new A000961(), Z.ONE);

  @Override
  public Z next() {
    while (true) {
      final Z t = mA.next();
      if (Functions.SOPF.z(t).mod(Functions.GPF.l(t)) == 0) {
        return t;
      }
    }
  }
}
