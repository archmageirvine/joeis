package irvine.oeis;

import irvine.math.z.Z;

/**
 * A sequence defined by a linear congruential generator (with small parameters).
 * @author Sean A. Irvine
 */
public class LinearCongruentialGenerator extends AbstractSequence {

  private final Z mA;
  private final Z mB;
  private final Z mM;
  private Z mS;
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
    if (a >= m || b >= m || s >= m || s < 0 || a < 0 || b < 0) {
      throw new IllegalArgumentException();
    }
    mA = Z.valueOf(a);
    mB = Z.valueOf(b);
    mM = Z.valueOf(m);
    mS = Z.valueOf(s);
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
    mS = mS.multiply(mA).add(mB).mod(mM);
  }

  /**
   * Compute the period of this generator.
   * (Uses brute force.)
   * @return length of period
   */
  public long computePeriod() {
    final Z t = mS;
    long cnt = 0;
    do {
      ++cnt;
      step();
    } while (!mS.equals(t));
    return cnt;
  }

  @Override
  public Z next() {
    if (mFirst) {
      mFirst = false;
      return mS;
    }
    step();
    return mS;
  }
}
