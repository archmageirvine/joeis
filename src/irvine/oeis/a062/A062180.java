package irvine.oeis.a062;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A062180 Harmonic mean of digits is 2.
 * @author Georg Fischer
 */
public class A062180 extends Sequence1 {

  private int mN;
  private Q mParm;

  /** Construct the sequence. */
  public A062180() {
    this(2);
  }

  /**
   * Generic constructor with parameters
   * @param parm
   */
  public A062180(final int parm) {
    mN = 0;
    mParm = new Q(parm, 1);
  }

  @Override
  public Z next() {
    while (A062179.harmonicMean(++mN).compareTo(mParm) != 0) {
    }
    return Z.valueOf(mN);
  }
}
