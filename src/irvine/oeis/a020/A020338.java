package irvine.oeis.a020;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;

/**
 * A020338 Doublets: base-10 representation is the juxtaposition of two identical strings.
 * @author Sean A. Irvine
 */
public class A020338 extends Sequence1 implements DirectSequence {

  private final long mBase;
  private final int mIBase;
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
    mIBase = Math.toIntExact(base);
  }

  @Override
  public Z next() {
    if (++mN == mT) {
      mT *= mBase;
    }
    return Z.valueOf(mN).multiply(mT).add(mN);
  }

  @Override
  public Z a(final Z n) {
    String s = n.toString(mIBase);
    return new Z(s + s);
  }

  @Override
  public Z a(final int n) {
    String s = Integer.toString(n, mIBase);
    return new Z(s + s);
  }

}
