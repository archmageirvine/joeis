package irvine.oeis.a029;

import irvine.math.z.Z;

/**
 * A029799 Cubes k such that k^(2/3) and k have same digits.
 * @author Sean A. Irvine
 */
public class A029799 extends A029797 {

  /** Construct the sequence. */
  public A029799() {
    super(0);
  }

  @Override
  public Z next() {
    return super.next().pow(3);
  }
}
