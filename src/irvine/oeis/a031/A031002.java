package irvine.oeis.a031;

import irvine.math.z.Z;
import irvine.oeis.a030.A030998;

/**
 * A031002 Position of n-th 3 in A030998.
 * @author Sean A. Irvine
 */
public class A031002 extends A030998 {

  /** Construct the sequence. */
  public A031002() {
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

