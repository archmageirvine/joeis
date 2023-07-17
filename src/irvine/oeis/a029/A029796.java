package irvine.oeis.a029;

import irvine.math.z.Z;

/**
 * A029796 Cubes such that cube root of n and n have same digits.
 * @author Sean A. Irvine
 */
public class A029796 extends A029795 {

  /** Construct the sequence. */
  public A029796() {
    super(0);
  }

  @Override
  public Z next() {
    return super.next().pow(3);
  }
}
