package irvine.oeis.a029;

import irvine.math.z.Z;

/**
 * A029791 Squares such that digits of sqrt(n) are not present in n or n^(3/2).
 * @author Sean A. Irvine
 */
public class A029791 extends A029790 {

  /** Construct the sequence. */
  public A029791() {
    super(0);
  }

  @Override
  public Z next() {
    return super.next().square();
  }
}
