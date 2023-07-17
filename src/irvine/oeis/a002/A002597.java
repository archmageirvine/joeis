package irvine.oeis.a002;

import irvine.math.z.Z;

/**
 * A002597 Number of partitions into one kind of 1's, two kinds of 2's, and three kinds of 3's.
 * @author Sean A. Irvine
 */
public class A002597 extends A002599 {

  /** Construct the sequence. */
  public A002597() {
    super(0);
  }

  private boolean mFirst = true;

  @Override
  protected int limit() {
    return 3;
  }

  @Override
  public Z next() {
    if (mFirst) {
      mFirst = false;
      return Z.ONE;
    }
    return super.next();
  }
}
