package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030343 Position of n-th 1 in A030341.
 * @author Sean A. Irvine
 */
public class A030343 extends A030341 {

  /** Construct the sequence. */
  public A030343() {
    super(1);
  }

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (Z.ONE.equals(super.next())) {
        return Z.valueOf(mN);
      }
    }
  }
}

