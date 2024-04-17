package irvine.oeis.a319;

import irvine.factor.factor.Jaguar;
import irvine.factor.prime.Puma;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirectSequence;

/**
 * A319692 a(n) = Product_{d|n, d&lt;n} prime(1+A001414(d)), where A001414(d) gives the sum of prime factors of d, with repetition.
 * @author Georg Fischer
 */
public class A319692 extends AbstractSequence implements DirectSequence {

  private int mN;

  /** Construct the sequence. */
  public A319692() {
    super(1);
    mN = 0;
  }

  @Override
  public final Z a(final Z n) {
    Z prod = Z.ONE;
    for (final Z dd : Jaguar.factor(n).divisors()) {
      if (!dd.equals(n)) {
        prod = prod.multiply(Puma.primeZ(Functions.SOPFR.z(dd).add(1)));
      }
    }
    return prod;
  }

  @Override
  public Z a(final int n) {
    return a(Z.valueOf(n));
  }

  @Override
  public Z next() {
    return a(++mN);
  }
}

