package irvine.oeis.a115;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A115114 Asymmetric rhythm cycles (patterns): binary necklaces of length 2n subject to the restriction that for any k if the k-th bead is of color 1 then the (k+n)-th bead (modulo 2n) is of color 0.
 * @author Gregory Morse
 */
public class A115114 extends Sequence1 {
  private final int mParts;
  private final boolean mPrimitive;
  private int mN = 0;

  protected A115114(final int parts, final boolean primitive) {
    mParts = parts;
    mPrimitive = primitive;
  }

  /** Construct the sequence. */
  public A115114() {
    this(2, false);
  }

  private Z weight(final long n) {
    return mPrimitive ? Functions.MOBIUS.z(n) : Functions.PHI.z(n);
  }

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (final Z d : Jaguar.factor(mN).divisors()) {
      final long k = d.longValueExact();
      sum = sum.add(weight(k * mParts));
      if (Functions.GCD.l(k, mParts) == 1) {
        sum = sum.add(weight(k).multiply(Z.valueOf(mParts + 1).pow(mN / k)));
      }
    }
    return sum.divide((long) mParts * mN);
  }
}
