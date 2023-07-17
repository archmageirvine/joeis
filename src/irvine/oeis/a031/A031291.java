package irvine.oeis.a031;

import irvine.math.z.Z;
import irvine.oeis.a007.A007376;

/**
 * A031291 Position of n-th 4 in A007376.
 * @author Sean A. Irvine
 */
public class A031291 extends A007376 {

  /** Construct the sequence. */
  public A031291() {
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

