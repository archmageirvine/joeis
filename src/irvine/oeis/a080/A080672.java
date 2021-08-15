package irvine.oeis.a080;
// manually 2021-08-15

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A080672 Numbers having divisors 2 or 3 or 5 or 7.
 * @author Georg Fischer
 */
public class A080672 implements Sequence {

  protected int mN;
  protected long mParm;

  /**
   * Construct the sequence.
   */
  public A080672() {
    this(210);
  }

  /**
   * Generic constructor with parameter
   * @param parm parameter
   */
  public A080672(final long parm) {
    mN = 0;
    mParm = parm;
  }

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (LongUtils.gcd(mN, mParm) > 1) {
        return Z.valueOf(mN);
      }
    }
  }
}
