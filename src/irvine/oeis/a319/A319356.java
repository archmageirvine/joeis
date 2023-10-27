package irvine.oeis.a319;

import java.util.function.BiFunction;

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

  private final DirectSequence mSeq;
  private int mN;
  private final BiFunction<Z, Z, Z> mLambda;

  /** Construct the sequence. */
  public A319356() {
    this(1, (d, v) -> Puma.primeZ(v.add(1)), new A003415());
  }

  /**
   * Generic constructor with parameters
   * @param offset first index
   * @param lambda lambda expression for dd
   * @param seq underlying sequence
   */
  public A319356(final int offset, final BiFunction<Z, Z, Z> lambda, final DirectSequence seq) {
    super(offset);
    mN = offset - 1;
    mSeq = seq;
    mLambda = lambda;
  }

  @Override
  public Z a(final Z n) {
    Z prod = Z.ONE;
    for (final Z dd : Jaguar.factor(n).divisors()) {
      if (!dd.equals(n)) {
        prod = prod.multiply(mLambda.apply(dd, mSeq.a(dd)));
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
