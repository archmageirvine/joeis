package irvine.oeis.a029;

import irvine.math.z.Z;

/**
 * A029777 Cubes such that digits of cube root of n appear in n.
 * @author Sean A. Irvine
 */
public class A029777 extends A029776 {

  /** Construct the sequence. */
  public A029777() {
    super(0);
  }

  @Override
  public Z next() {
    return super.next().pow(3);
  }
}
