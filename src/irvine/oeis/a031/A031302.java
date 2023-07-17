package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031302 Position of n-th 3 in A031298.
 * @author Sean A. Irvine
 */
public class A031302 extends A031298 {

  /** Construct the sequence. */
  public A031302() {
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

