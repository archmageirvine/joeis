package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030390 Position of n-th 3 in A030386.
 * @author Sean A. Irvine
 */
public class A030390 extends A030386 {

  /** Construct the sequence. */
  public A030390() {
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

