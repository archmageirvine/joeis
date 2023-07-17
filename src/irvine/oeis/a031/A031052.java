package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031052 Position of n-th 6 in A031045.
 * @author Sean A. Irvine
 */
public class A031052 extends A031045 {

  /** Construct the sequence. */
  public A031052() {
    super(1);
  }

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (Z.SIX.equals(super.next())) {
        return Z.valueOf(mN);
      }
    }
  }
}

