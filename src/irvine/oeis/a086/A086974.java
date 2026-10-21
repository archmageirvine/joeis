
package irvine.oeis.a086;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.ThreeParameterFormSequence;

/**
 * A086974 Numbers of the form p^2 * q * r with distinct primes p, q and r such that p^2 &lt; q*r.
 * @author Sean A. Irvine
 */
public class A086974 extends ThreeParameterFormSequence {

  /** Construct the sequence. */
  public A086974() {
    super(1, 1, 1, 2, (i, j, k) -> {
      if (j >= k) {
        return null;
      }
      final Z p = Functions.PRIME.z(i);
      final Z q = Functions.PRIME.z(j);
      final Z r = Functions.PRIME.z(k);
      final Z p2 = p.square();
      final Z qr = q.multiply(r);
      if (p2.compareTo(qr) > 0) {
        return null;
      }
      return p2.multiply(qr);
    });
  }

  @Override
  protected Z select(final long i, final long j, final long k, final Z n) {
    return i == j || i == k ? Z.ZERO : n;
  }

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (!t.isZero()) {
        return t;
      }
    }
  }
}
