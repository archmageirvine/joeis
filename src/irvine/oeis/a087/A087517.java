package irvine.oeis.a087;

import irvine.math.z.Z;

/**
 * A087517 Consider pairs (i,j) such that j*prime(i)# - prime(i+2) and j*prime(i)# - prime(i+1) are consecutive primes and 0 &lt; j &lt; prime(i+1), where prime(r)# = r-th primorial number (A002110). Sequence gives j values.
 * @author Sean A. Irvine
 */
public class A087517 extends A087516 {

  protected Z select(final long i, final long j) {
    return Z.valueOf(j);
  }
}

