package irvine.oeis.a087;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.ThreeParameterFormSequence;

/**
 * A087054 Primes of the form pq + qr + rp where p, q and r are distinct primes.
 * @author Sean A. Irvine
 */
public class A087054 extends ThreeParameterFormSequence {

  /** Construct the sequence. */
  public A087054() {
    super(1, 1, 2, 3, (i, j, k) -> {
      if (i >= j || j >= k) {
        return null;
      }
      final Z p = Functions.PRIME.z(i);
      final Z q = Functions.PRIME.z(j);
      final Z r = Functions.PRIME.z(k);
      return p.multiply(q).add(p.multiply(r)).add(q.multiply(r));
    });
  }

  @Override
  protected boolean accept(final long x, final long y, final long z, final Z n, final Z prev) {
    return super.accept(x, y, z, n, prev) && n.isProbablePrime();
  }
}
