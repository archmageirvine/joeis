package irvine.oeis.a104;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A104088 Largest prime &lt;= 3^n.
 * @author Sean A. Irvine
 */
public class A104088 implements Sequence {

  private final Fast mPrime = new Fast();
  private int mN = 0;

  private Z mBase; // base

  /** Construct the sequence. */
  public A104088() {
    this(3);
  }

  /**
   * Generic constructor with parameter
   * @param base base to be raised to power <code>mN</code>
   */
  public A104088(final int base) {
    mBase = Z.valueOf(base);
  }

  @Override
  public Z next() {
    return mPrime.prevPrime(mBase.pow(++mN).add(1));
  }
}
