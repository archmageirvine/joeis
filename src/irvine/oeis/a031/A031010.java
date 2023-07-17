package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031010 Position of n-th 2 in A031007.
 * @author Sean A. Irvine
 */
public class A031010 extends A031007 {

  /** Construct the sequence. */
  public A031010() {
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

