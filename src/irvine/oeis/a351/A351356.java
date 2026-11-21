package irvine.oeis.a351;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A351356 Triangle read by rows T(n,k): number of binary necklaces with n beads, k of them black, and at least two consecutive black beads.
 * @author Gregory Morse
 */
public class A351356 extends Sequence1 {
  private final int mRun;
  private int mN = 0;
  private int mK = 0;

  protected A351356(final int run) {
    mRun = run;
  }

  /** Construct the sequence. */
  public A351356() {
    this(2);
  }

  private Z avoided(final int n, final int k) {
    final int white = n - k;
    if (white == 0) {
      return Z.ZERO;
    }
    Z sum = Z.ZERO;
    for (int j = 0; j <= Math.min(white, k / mRun); ++j) {
      sum = sum.signedAdd((j & 1) == 0, Binomial.binomial(white, j).multiply(Binomial.binomial(n - 1 - j * mRun, white - 1)));
    }
    return sum.multiply(n).divide(white);
  }

  protected final Z t(final int n, final int k) {
    if (k < mRun) {
      return Z.ZERO;
    }
    Z sum = Z.ZERO;
    for (final Z divisor : Jaguar.factor(Functions.GCD.i(n, k)).divisors()) {
      final int d = divisor.intValueExact();
      final Z count = Binomial.binomial(n / d, k / d).subtract(avoided(n / d, k / d));
      sum = sum.add(count.multiply(Functions.PHI.z(d)));
    }
    return sum.divide(n);
  }

  @Override
  public Z next() {
    if (++mK > mN || mN == 0) {
      ++mN;
      mK = 0;
    }
    return t(mN, mK);
  }
}
