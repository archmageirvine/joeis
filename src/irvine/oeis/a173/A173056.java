package irvine.oeis.a173;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.TwoParameterFormSequence;

/**
 * A173056 Numbers of the form p^q + q^p, where p and q are primes.
 * @author Sean A. Irvine
 */
public class A173056 extends TwoParameterFormSequence {

  /** Construct the sequence. */
  public A173056() {
    super(1, 1, 1, (j, k) -> {
      if (j < k) {
        return null;
      }
      final Z p = Functions.PRIME.z(j);
      final Z q = Functions.PRIME.z(k);
      return p.pow(q).add(q.pow(p));
    });
  }
}
