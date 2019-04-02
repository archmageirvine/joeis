package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.a015.A015224;

/**
 * A014800 Squares of even pentagonal pyramidal numbers.
 * @author Sean A. Irvine
 */
public class A014800 extends A015224 {

  @Override
  public Z next() {
    return super.next().square();
  }
}
