package irvine.oeis.a064;

import irvine.factor.factor.Jaguar;
import irvine.factor.prime.Puma;
import irvine.math.z.Z;

/**
 * A064741 Length of A064743(n); Index of the largest prime factor of the n-th term of EKG-sequence.
 * @author Sean A. Irvine
 */
public class A064741 extends A064413 {

  @Override
  public Z next() {
    final Z k = super.next();
    return k.isZero() ? Z.ZERO : Puma.primePiZ(Jaguar.factor(k).largestPrimeFactor());
  }
}

