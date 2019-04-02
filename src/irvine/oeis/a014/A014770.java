package irvine.oeis.a014;

import irvine.math.z.Z;

/**
 * A014770 Squares of even pentagonal numbers.
 * @author Sean A. Irvine
 */
public class A014770 extends A014633 {

  @Override
  public Z next() {
    return super.next().square();
  }
}
