package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030570 Position of n-th 2 in A030567.
 * @author Sean A. Irvine
 */
public class A030570 extends A030567 {

  /** Construct the sequence. */
  public A030570() {
    super(1);
  }

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (Z.TWO.equals(super.next())) {
        return Z.valueOf(mN);
      }
    }
  }
}

