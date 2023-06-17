package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A000564 Number of discordant permutations.
 * @author Sean A. Irvine
 */
public class A000564 extends AbstractSequence {

  /** Construct the sequence. */
  public A000564() {
    super(6);
  }

  private long mN = 5;

  private static final long[] CONSTANTS = {
    -303480,
    280714,
    -106335,
    20565,
    -2025,
    81,
  };

  @Override
  public Z next() {
    if (++mN == 6) {
      return Z.valueOf(20);
    }
    Z n = Z.ONE;
    Z s = Z.ZERO;
    for (final long c : CONSTANTS) {
      n = n.multiply(mN);
      s = s.add(n.multiply(c));
    }
    return s.divide(80);
  }
}

