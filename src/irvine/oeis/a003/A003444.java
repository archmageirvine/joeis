package irvine.oeis.a003;

import irvine.factor.factor.Jaguar;
import irvine.math.LongUtils;
import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A003444 Number of dissections of a polygon.
 * @author Sean A. Irvine
 */
public class A003444 extends AbstractSequence {

  /** Construct the sequence. */
  public A003444() {
    super(4);
  }

  private long mN = 2;

  @Override
  public Z next() {
    ++mN;
    Z s = Z.ZERO;
    for (final Z dz : Jaguar.factor(LongUtils.gcd(2 * mN, mN - 2)).divisors()) {
      final long d = dz.longValueExact();
      s = s.add(Binomial.binomial(2 * mN / d, (mN - 2) / d).multiply(Functions.PHI.l(d)));
    }
    return s.divide(2 * mN);
  }
}
