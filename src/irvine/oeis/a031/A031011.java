package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031011 Position of n-th 3 in A031007.
 * @author Sean A. Irvine
 */
public class A031011 extends A031007 {

  /** Construct the sequence. */
  public A031011() {
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

