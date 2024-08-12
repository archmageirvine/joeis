package irvine.oeis.a029;

import irvine.math.z.Z;

/**
 * A029792 Cubes k such that digits of cube root of k are not present in k^(2/3) or k.
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
