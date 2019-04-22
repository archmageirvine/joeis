package irvine.oeis.a020;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A020338.
 * @author Sean A. Irvine
 */
public class A020338 implements Sequence {

  private final long mBase;
  private long mN = 0;
  private long mT;

  /** Construct the sequence. */
  public A020338() {
    this(10);
  }

  /**
   * Construct this sequence for a specific base
   * @param base the base
   */
  public A020338(final long base) {
    mT = base;
    mBase = base;
  }

  @Override
  public Z next() {
    if (++mN == mT) {
      mT *= mBase;
    }
    return Z.valueOf(mN).multiply(mT).add(mN);
  }
}
