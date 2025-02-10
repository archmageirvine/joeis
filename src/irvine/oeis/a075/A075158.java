package irvine.oeis.a075;

import irvine.factor.factor.Jaguar;
import irvine.factor.prime.Fast;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A075158 Prime factorization of n+1 encoded with the run lengths of binary expansion.
 * @author Sean A. Irvine
 */
public class A075158 extends Sequence0 {

  private final Fast mPrime = new Fast();
  private long mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ZERO;
    }
    final FactorSequence fs = Jaguar.factor(mN + 1);
    final Z[] f = fs.toZArray();
    Z p = f[f.length - 1];
    Z v = Z.ZERO;
    long bit = 1;
    int e = fs.getExponent(p);
    while (p.compareTo(Z.ONE) > 0) {
      for (int k = 0; k < e; ++k) {
        v = v.multiply2().add(bit);
      }
      p = mPrime.prevPrime(p);
      e = fs.getExponent(p) + 1;
      bit = 1 - bit;
    }
    return v;
  }
}
