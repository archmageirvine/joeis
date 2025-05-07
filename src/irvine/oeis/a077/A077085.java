package irvine.oeis.a077;

import java.util.HashSet;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A077085 Initial values such that if A077080(x)=phi(sigma(x)+phi(x)) is started at these numbers then the sequence does not converge.
 * @author Sean A. Irvine
 */
public class A077085 extends Sequence1 {

  // All current terms actually survive at least 1000 iterations
  private static final int MAX_ITERATIONS = 100;
  private long mN = 533;

  private boolean is(final long n) {
    final HashSet<Z> seen = new HashSet<>();
    Z t = Z.valueOf(n);
    for (int k = 0; k < MAX_ITERATIONS; ++k) {
      final Z s = Functions.PHI.z(Functions.SIGMA1.z(t).add(Functions.PHI.z(t)));
      if (!seen.add(s)) {
        return false; // converges or cycles
      }
      t = s;
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      if (is(++mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}

