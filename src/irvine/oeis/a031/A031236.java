package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031236 Position of n-th 0 in A031235.
 * @author Sean A. Irvine
 */
public class A031236 extends A031235 {

  /** Construct the sequence. */
  public A031236() {
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

