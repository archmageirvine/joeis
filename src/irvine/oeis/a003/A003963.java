package irvine.oeis.a003;

import java.util.HashMap;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;

/**
 * A003963 Fully multiplicative with a(p) = k if p is the k-th prime.
 * @author Sean A. Irvine
 */
public class A003963 extends Sequence1 implements DirectSequence {

  private long mN = 0;
  private Z mP = Z.ZERO;
  private final HashMap<Z, Z> mPrimeToIndex = new HashMap<>();

  protected Z pi(final Z p) {
    final Z pi = mPrimeToIndex.get(p);
    if (pi != null) {
      return pi;
    }
    mP = mP.add(1);
    mPrimeToIndex.put(p, mP);
    return mP;
  }

  @Override
  public Z next() {
    return a(++mN);
  }

  @Override
  public Z a(final Z n) {
    if (n.isOne()) {
      return Z.ONE;
    }
    final FactorSequence fs = Jaguar.factor(n);
    Z prod = Z.ONE;
    for (final Z p : fs.toZArray()) {
      prod = prod.multiply(pi(p).pow(fs.getExponent(p)));
    }
    return prod;
  }

  @Override
  public Z a(final long n) {
    return a(Z.valueOf(n));
  }
}
