package irvine.oeis.a048;

import irvine.factor.factor.Jaguar;
import irvine.factor.prime.Puma;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirectSequence;

/**
 * A048675 If n = p_i^e_i * ... * p_k^e_k, p_i &lt; ... &lt; p_k primes (with p_i = prime(i)), then a(n) = (1/2) * (e_i * 2^i + ... + e_k * 2^k).
 * @author Sean A. Irvine
 */
public class A048675 extends AbstractSequence implements DirectSequence {

  private long mN = 0;

  /** Construct the sequence. */
  public A048675() {
    super(1);
  }

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    final FactorSequence fs = Jaguar.factor(++mN);
    for (final Z p : fs.toZArray()) {
      sum = sum.add(Z.valueOf(fs.getExponent(p)).shiftLeft(Puma.primePi(p)));
    }
    return sum.divide2();
  }

  @Override
  public Z a(final int n) {
    return a(Z.valueOf(n));
  }

  @Override
  public Z a(final Z n) {
    Z sum = Z.ZERO;
    final FactorSequence fs = Jaguar.factor(n);
    for (final Z p : fs.toZArray()) {
      sum = sum.add(Z.valueOf(fs.getExponent(p)).shiftLeft(Puma.primePi(p)));
    }
    return sum.divide2();
  }

}

