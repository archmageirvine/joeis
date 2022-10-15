package irvine.oeis.a059;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A059896 The set of Fermi-Dirac factors of A(n,k) is the union of the Fermi-Dirac factors of n and k. Symmetric square array read by antidiagonals.
 * @author Sean A. Irvine
 */
public class A059896 implements Sequence {

  private long mN = 0;
  private long mM = 0;

  private Z t(final long n, final long m) {
    final FactorSequence nf = Jaguar.factor(n);
    final FactorSequence mf = Jaguar.factor(m);
    Z prod = Z.ONE;
    // Deal the any factors occurring in n
    for (final Z np : nf.toZArray()) {
      final int ne = nf.getExponent(np);
      final int me = mf.getExponent(np);
      prod = prod.multiply(np.pow(ne | me));
    }
    // Deal with any factors occurring only in m
    for (final Z mp : mf.toZArray()) {
      final int ne = nf.getExponent(mp);
      if (ne == 0) {
        final int me = mf.getExponent(mp);
        prod = prod.multiply(mp.pow(me));
      }
    }
    return prod;
  }

  @Override
  public Z next() {
    if (++mM >= mN) {
      ++mN;
      mM = 0;
    }
    return t(mN - mM, mM + 1);
  }
}
