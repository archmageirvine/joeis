package irvine.oeis.a005;

import irvine.factor.factor.Jaguar;
import irvine.math.LongUtils;
import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A005516 Number of n-bead bracelets (turnover necklaces) with 12 red beads.
 * @author Sean A. Irvine
 */
public class A005516 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A005516(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A005516() {
    super(12);
  }

  private final int mK = beads();
  private int mN = mK - 1;

  protected int beads() {
    return 12;
  }

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (final Z dd : Jaguar.factor(LongUtils.gcd(mN, mK)).divisors()) {
      final int d = dd.intValueExact();
      sum = sum.add(Binomial.binomial(mN / d, mK / d).multiply(Functions.PHI.l((long) d)));
    }
    sum = sum.divide(mN);
    sum = sum.add(Binomial.binomial(((mN & 1) == 1 ? mN - 1 : mN - ((mK & 1) == 1 ? 2 : 0)) / 2, mK / 2));
    return sum.divide2();
  }
}
