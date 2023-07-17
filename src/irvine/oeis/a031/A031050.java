package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031050 Position of n-th 4 in A031045.
 * @author Sean A. Irvine
 */
public class A031050 extends A031045 {

  /** Construct the sequence. */
  public A031050() {
    super(1);
  }

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (Z.FOUR.equals(super.next())) {
        return Z.valueOf(mN);
      }
    }
  }
}

