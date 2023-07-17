package irvine.oeis.a031;

import irvine.math.z.Z;
import irvine.oeis.a007.A007376;

/**
 * A031287 Position of n-th 0 in A007376.
 * @author Sean A. Irvine
 */
public class A031287 extends A007376 {

  /** Construct the sequence. */
  public A031287() {
    super(1);
  }

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (super.next().isZero()) {
        return Z.valueOf(mN);
      }
    }
  }
}

