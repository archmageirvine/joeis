package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031008 Position of n-th 0 in A031007.
 * @author Sean A. Irvine
 */
public class A031008 extends A031007 {

  /** Construct the sequence. */
  public A031008() {
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

