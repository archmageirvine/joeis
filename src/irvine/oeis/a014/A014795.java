package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.a015.A015219;

/**
 * A014795 Squares of odd tetrahedral numbers.
 * @author Sean A. Irvine
 */
public class A014795 extends A015219 {

  @Override
  public Z next() {
    return super.next().square();
  }
}
