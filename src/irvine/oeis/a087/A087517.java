package irvine.oeis.a087;

import irvine.math.z.Z;

/**
 * A152304. Consider pairs (i,j) such that j*P(i)# - P(i+2) and j*P(i)# - P(i+1) are consecutive primes and 0 < j < P(i+1), where P(r) = r-th prime and P(r)# = r-th primorial number (A002110). Sequence gives i values.
 * @author Sean A. Irvine
 */
public class A087517 extends A087516 {

  protected Z select(final long i, final long j) {
    return Z.valueOf(j);
  }
}

