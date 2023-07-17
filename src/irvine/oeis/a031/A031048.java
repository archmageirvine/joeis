package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031048 Position of n-th 2 in A031045.
 * @author Sean A. Irvine
 */
public class A031048 extends A031045 {

  /** Construct the sequence. */
  public A031048() {
    super(1);
  }

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (Z.TWO.equals(super.next())) {
        return Z.valueOf(mN);
      }
    }
  }
}

