package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030388 Position of n-th 1 in A030386.
 * @author Sean A. Irvine
 */
public class A030388 extends A030386 {

  /** Construct the sequence. */
  public A030388() {
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

