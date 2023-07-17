package irvine.oeis.a000;

import irvine.math.z.Z;

/**
 * A000094 Number of trees of diameter 4.
 * @author Sean A. Irvine
 */
public class A000094 extends A000041 {

  /** Construct the sequence. */
  public A000094() {
    super(1);
  }

  @Override
  public Z next() {
    final Z z = super.next().add(-mN);
    return mN == 0 ? Z.ZERO : z;
  }
}

