package irvine.oeis.a014;

import irvine.math.z.Z;

/**
 * A014721 Squares of elements to left of the central element in Pascal triangle (by row).
 * @author Sean A. Irvine
 */
public class A014721 extends A014413 {

  @Override
  public Z next() {
    return super.next().square();
  }
}
