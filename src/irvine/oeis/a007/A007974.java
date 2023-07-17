package irvine.oeis.a007;

import irvine.math.z.Z;

/**
 * A007974 Number of permutations that are n-3 "block reversals" away from 12...n.
 * @author Sean A. Irvine
 */
public class A007974 extends A007975 {

  /** Construct the sequence. */
  public A007974() {
    super(3);
  }

  @Override
  protected int start() {
    return 2;
  }

  @Override
  public Z next() {
    init();
    for (int k = 0; k < mN - 3; ++k) {
      step();
    }
    return Z.valueOf(mPrev.size());
  }
}
