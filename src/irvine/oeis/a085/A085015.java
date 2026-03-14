package irvine.oeis.a085;

import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A085015 Multiplicity of the root 1 in the characteristic polynomial mod 2 of the n X n matrix with entries binomial(i+j,i), 0&lt;=i,j&lt;n.
 * @author Sean A. Irvine
 */
public class A085015 extends CachedSequence {

  /** Construct the sequence. */
  public A085015() {
    super(0, Long.class, (self, n) -> {
      if (n == 0) {
        return Z.ZERO;
      }
      long l = 0;
      long t = 1;
      while (t < n) {
        t <<= 1;
        ++l;
      }
      final long k = t - n;
      return Z.valueOf(t).add((l & 1) == 0 ? 2 : 0).divide(3).subtract(k).add(self.a(k).multiply2());
    });
  }
}

