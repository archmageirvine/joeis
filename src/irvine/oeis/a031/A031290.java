package irvine.oeis.a031;

import irvine.math.z.Z;
import irvine.oeis.a007.A007376;

/**
 * A031290 Position of n-th 3 in A007376.
 * @author Sean A. Irvine
 */
public class A031290 extends A007376 {

  /** Construct the sequence. */
  public A031290() {
    super(1);
  }

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (Z.THREE.equals(super.next())) {
        return Z.valueOf(mN);
      }
    }
  }
}

