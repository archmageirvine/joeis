package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030572 Position of n-th 4 in A030567.
 * @author Sean A. Irvine
 */
public class A030572 extends A030567 {

  /** Construct the sequence. */
  public A030572() {
    super(1);
  }

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (Z.FOUR.equals(super.next())) {
        return Z.valueOf(mN);
      }
    }
  }
}

