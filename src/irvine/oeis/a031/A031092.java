package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031092 Position of n-th 4 in A031087.
 * @author Sean A. Irvine
 */
public class A031092 extends A031087 {

  /** Construct the sequence. */
  public A031092() {
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

