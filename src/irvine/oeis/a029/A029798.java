package irvine.oeis.a029;

import irvine.math.z.Z;

/**
 * A029798 Squares such that n and n^(3/2) have same digits.
 * @author Sean A. Irvine
 */
public class A029798 extends A029797 {

  /** Construct the sequence. */
  public A029798() {
    super(0);
  }

  @Override
  public Z next() {
    return super.next().square();
  }
}
