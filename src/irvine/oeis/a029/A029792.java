package irvine.oeis.a029;

import irvine.math.z.Z;

/**
 * A029792 Cubes such that digits of cube root of n are not present in n^(2/3) or n.
 * @author Sean A. Irvine
 */
public class A029792 extends A029790 {

  /** Construct the sequence. */
  public A029792() {
    super(0);
  }

  @Override
  public Z next() {
    return super.next().pow(3);
  }
}
