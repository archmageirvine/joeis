
package irvine.oeis.a086;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.ThreeParameterFormSequence;

/**
 * A086975 Numbers of the form p^2 * q * r with primes p &lt; q &lt; r.
 * @author Sean A. Irvine
 */
public class A086975 extends ThreeParameterFormSequence {

  /** Construct the sequence. */
  public A086975() {
    super(1, 1, 2, 3, (i, j, k) -> {
      if (i >= j || j >= k) {
        return null;
      }
      final Z p = Functions.PRIME.z(i);
      final Z q = Functions.PRIME.z(j);
      final Z r = Functions.PRIME.z(k);
      return p.square().multiply(q.multiply(r));
    });
  }
}
