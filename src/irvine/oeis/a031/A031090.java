package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031090 Position of n-th 2 in A031087.
 * @author Sean A. Irvine
 */
public class A031090 extends A031087 {

  /** Construct the sequence. */
  public A031090() {
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

