package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031093 Position of n-th 5 in A031087.
 * @author Sean A. Irvine
 */
public class A031093 extends A031087 {

  /** Construct the sequence. */
  public A031093() {
    super(1);
  }

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (Z.FIVE.equals(super.next())) {
        return Z.valueOf(mN);
      }
    }
  }
}

