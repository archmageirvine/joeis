package irvine.oeis.a005;

import irvine.factor.factor.PrimeDivision;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005735 Greatest k such that binomial(k,n) has fewer than n distinct prime factors.
 * @author Sean A. Irvine
 */
public class A005735 implements Sequence {

  // Heuristic after T. D. Noe

  private static final long HEURISTIC_SCALE_FACTOR = 10;
  private final PrimeDivision mF = new PrimeDivision();
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long k = 1;
    long m = Long.MAX_VALUE;
    long m0 = m;
    while (k < m) {
      if (mF.factorize(Binomial.binomial(k, mN)).omega() < mN) {
        m = HEURISTIC_SCALE_FACTOR * k;
        m0 = k;
      }
      ++k;
    }
    return Z.valueOf(m0);
  }
}
