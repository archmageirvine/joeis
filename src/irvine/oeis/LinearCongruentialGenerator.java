package irvine.oeis;

import irvine.math.z.Z;

/**
 * A sequence defined by a linear congruential generator (with small parameters).
 * @author Sean A. Irvine
 */
public class LinearCongruentialGenerator extends AbstractSequence {

  private final long mA;
  private final long mB;
  private final long mM;
  private long mS;
  private boolean mFirst = true;

  /**
   * A new linear congruential generator.
   * @param offset sequence offset (usually 1)
   * @param a multiplier
   * @param b additive value
   * @param m modulus
   * @param s initial state
   */
  public LinearCongruentialGenerator(final int offset, final long a, final long b, final long m, final long s) {
    super(offset);
    if (a >= m || b >= m || s >= m || s < 0 || a < 0 || b < 0 || m > Integer.MAX_VALUE) {
      throw new IllegalArgumentException();
    }
    mA = a;
    mB = b;
    mM = m;
    mS = s;
  }

  /**
   * A new linear congruential generator.
   * @param a multiplier
   * @param b additive value
   * @param m modulus
   * @param s initial state
   */
  public LinearCongruentialGenerator(final long a, final long b, final long m, final long s) {
    this(1, a, b, m, s);
  }

  /**
   * A new linear congruential generator.
   * @param a multiplier
   * @param b additive value
   * @param m modulus
   */
  public LinearCongruentialGenerator(final long a, final long b, final long m) {
    this(1, a, b, m, 1L);
  }

  private void step() {
    mS = (mS * mA + mB) % mM;
  }

  /**
   * Compute the period of this generator.
   * (Uses brute force.)
   * @return length of period
   */
  public long computePeriod() {
    final long t = mS;
    long cnt = 0;
    do {
      ++cnt;
      step();
    } while (mS != t);
    return cnt;
  }

  @Override
  public Z next() {
    if (mFirst) {
      mFirst = false;
      return Z.valueOf(mS);
    }
    step();
    return Z.valueOf(mS);
  }
}
