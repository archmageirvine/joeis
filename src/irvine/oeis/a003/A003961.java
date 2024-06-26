package irvine.oeis.a003;

import irvine.factor.factor.Jaguar;
import irvine.factor.prime.Fast;
import irvine.factor.util.FactorSequence;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirectSequence;

/**
 * A003961 Completely multiplicative with a(prime(k)) = prime(k+1).
 * @author Sean A. Irvine
 */
public class A003961 extends AbstractSequence implements DirectSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A003961(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A003961() {
    super(1);
  }

  private long mN = 0;
  private final Fast mPrime = new Fast();

  @Override
  public Z next() {
    final FactorSequence fs = Jaguar.factor(++mN);
    Z prod = Z.ONE;
    for (final Z p : fs.toZArray()) {
      prod = prod.multiply(mPrime.nextPrime(p).pow(fs.getExponent(p)));
    }
    return prod;
  }

  @Override
  public Z a(final int n) {
    return a(Z.valueOf(n));
  }

  @Override
  public Z a(final Z n) {
    final FactorSequence fs = Jaguar.factor(n);
    Z prod = Z.ONE;
    for (final Z p : fs.toZArray()) {
      prod = prod.multiply(Functions.NEXT_PRIME.z(p).pow(fs.getExponent(p)));
    }
    return prod;
  }

}
