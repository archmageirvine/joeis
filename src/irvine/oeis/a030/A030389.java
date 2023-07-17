package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030389 Position of n-th 2 in A030386.
 * @author Sean A. Irvine
 */
public class A030389 extends A030386 {

  /** Construct the sequence. */
  public A030389() {
    super(1);
  }

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (Z.TWO.equals(super.next())) {
        return Z.valueOf(mN);
      }
    }
  }
}

