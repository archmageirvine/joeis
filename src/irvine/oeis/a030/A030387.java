package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030387 Position of n-th 0 in A030386.
 * @author Sean A. Irvine
 */
public class A030387 extends A030386 {

  /** Construct the sequence. */
  public A030387() {
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

