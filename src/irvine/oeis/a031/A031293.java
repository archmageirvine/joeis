package irvine.oeis.a031;

import irvine.math.z.Z;
import irvine.oeis.a007.A007376;

/**
 * A031293 Position of n-th 6 in A007376.
 * @author Sean A. Irvine
 */
public class A031293 extends A007376 {

  /** Construct the sequence. */
  public A031293() {
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

