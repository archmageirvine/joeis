package irvine.oeis.a082;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.TwoParameterFormSequence;

/**
 * A082949 Numbers of the form p^q * q^p, with distinct primes p and q.
 * @author Sean A. Irvine
 */
public class A082949 extends TwoParameterFormSequence {

  /** Construct the sequence. */
  public A082949() {
    super(1, 1, 2, (j, k) -> {
      if (j >= k) {
        return null;
      }
      final Z p = Functions.PRIME.z(j);
      final Z q = Functions.PRIME.z(k);
      return p.pow(q).multiply(q.pow(p));
    });
  }
}
