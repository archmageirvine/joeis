package irvine.oeis.a031;

import irvine.math.z.Z;
import irvine.oeis.a007.A007376;

/**
 * A031292 Position of n-th 5 in A007376.
 * @author Sean A. Irvine
 */
public class A031292 extends A007376 {

  /** Construct the sequence. */
  public A031292() {
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

