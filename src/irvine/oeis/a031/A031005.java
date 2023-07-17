package irvine.oeis.a031;

import irvine.math.z.Z;
import irvine.oeis.a030.A030998;

/**
 * A031005 Position of n-th 6 in A030998.
 * @author Sean A. Irvine
 */
public class A031005 extends A030998 {

  /** Construct the sequence. */
  public A031005() {
    super(1);
  }

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (Z.SIX.equals(super.next())) {
        return Z.valueOf(mN);
      }
    }
  }
}

