package irvine.oeis.a003;

import java.util.HashMap;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000045;

/**
 * A003965 Fully multiplicative with a(prime(k)) = Fibonacci(k+2).
 * @author Sean A. Irvine
 */
public class A003965 implements Sequence {

  private long mN = 0;
  private final HashMap<Z, Z> mPrimeToIndex = new HashMap<>();
  private final A000045 mFibo = new A000045();
  {
    mFibo.next();
    mFibo.next();
    mFibo.next();
  }

  protected Z fiboPi(final Z p) {
    final Z pi = mPrimeToIndex.get(p);
    if (pi != null) {
      return pi;
    }
    final Z res = mFibo.next();
    mPrimeToIndex.put(p, res);
    return res;
  }

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    final FactorSequence fs = Cheetah.factor(mN);
    Z prod = Z.ONE;
    for (final Z p : fs.toZArray()) {
      prod = prod.multiply(fiboPi(p).pow(fs.getExponent(p)));
    }
    return prod;
  }
}
