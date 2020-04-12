package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031163 Square roots of numbers that are both lucky and square.
 * @author Sean A. Irvine
 */
public class A031163 extends A031162 {

  @Override
  public Z next() {
    return super.next().sqrt();
  }
}
