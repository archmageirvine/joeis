package irvine.oeis.a005;

import irvine.factor.factor.PrimeDivision;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A005733 Least k such that binomial(k,n) has n or more distinct prime factors.
 * @author Sean A. Irvine
 */
public class A005733 extends Sequence1 {

  private final PrimeDivision mF = new PrimeDivision();
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long k = 2;
    while (true) {
      if (mF.factorize(Binomial.binomial(k, mN)).omega() >= mN) {
        return Z.valueOf(k);
      }
      ++k;
    }
  }
}
