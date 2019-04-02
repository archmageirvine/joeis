package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.a015.A015225;

/**
 * A014801 Squares of odd hexagonal pyramidal numbers.
 * @author Sean A. Irvine
 */
public class A014801 extends A015225 {

  @Override
  public Z next() {
    return super.next().square();
  }
}
