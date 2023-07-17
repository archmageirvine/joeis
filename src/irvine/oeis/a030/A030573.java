package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030573 Position of n-th 5 in A030567.
 * @author Sean A. Irvine
 */
public class A030573 extends A030567 {

  /** Construct the sequence. */
  public A030573() {
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

