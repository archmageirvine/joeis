package irvine.oeis.a029;

import irvine.math.z.Z;

/**
 * A029796 Cubes k such that cube root of k and k have the same set of digits.
 * @author Sean A. Irvine
 */
public class A029796 extends A029795 {

  /** Construct the sequence. */
  public A029796() {
    super(1);
  }

  @Override
  public Z next() {
    return super.next().pow(3);
  }
}
