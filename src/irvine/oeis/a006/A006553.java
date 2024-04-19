package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A006553 Numbers k such that k*3^k - 1 is prime.
 * @author Sean A. Irvine
 */
public class A006553 extends Sequence1 {

  private long mN = 0;
  private Z mT = Z.ONE;
  private final int mBase;

  /** Construct the sequence. */
  public A006553() {
    this(3);
  }

  /**
   * Generic constructor with parameter.
   * @param base base for k
   */
  public A006553(final int base) {
    mBase = base;
  }

  @Override
  public Z next() {
    while (true) {
      ++mN;
      mT = mT.multiply(mBase);
      if (mT.multiply(mN).subtract(1).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
