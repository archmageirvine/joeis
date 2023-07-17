package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031304 Position of n-th 5 in A031298.
 * @author Sean A. Irvine
 */
public class A031304 extends A031298 {

  /** Construct the sequence. */
  public A031304() {
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

