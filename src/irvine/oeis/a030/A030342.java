package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030342 Position of n-th 0 in A030341.
 * @author Sean A. Irvine
 */
public class A030342 extends A030341 {

  /** Construct the sequence. */
  public A030342() {
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

