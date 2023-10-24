package irvine.oeis.a319;

import irvine.factor.factor.Jaguar;
import irvine.factor.prime.Puma;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirectSequence;
import irvine.oeis.a003.A003415;

/**
 * A319356 a(n) = Product_{d|n, d&lt;n} prime(1+A003415(d)), where A003415(d) gives arithmetic derivative of d.
 * @author Georg Fischer
 */
public class A319356 extends AbstractSequence implements DirectSequence {

  private final A003415 mSeq = new A003415();
  private int mN = 0;

  /** Construct the sequence. */
  public A319356() {
    super(1);
  }

  @Override
  public final Z a(final Z n) {
    Z prod = Z.ONE;
    for (final Z dd : Jaguar.factor(n).divisors()) {
      if (!dd.equals(n)) {
        prod = prod.multiply(Puma.primeZ(mSeq.a(dd).add(1)));
      }
    }
    return prod;
  }

  @Override
  public final Z a(final int n) {
    return a(Z.valueOf(n));
  }

  @Override
  public Z next() {
    return a(++mN);
  }
}

