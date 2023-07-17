package irvine.oeis.a031;

import irvine.math.z.Z;
import irvine.oeis.a007.A007376;

/**
 * A031288 Position of n-th 1 in A007376.
 * @author Sean A. Irvine
 */
public class A031288 extends A007376 {

  /** Construct the sequence. */
  public A031288() {
    super(1);
  }

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (Z.ONE.equals(super.next())) {
        return Z.valueOf(mN);
      }
    }
  }
}

