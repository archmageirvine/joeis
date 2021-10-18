package irvine.oeis.a052;

import irvine.math.z.Z;

/**
 * A052050 Squares whose digits occur with an equal minimal frequency of 2.
 * @author Sean A. Irvine
 */
public class A052050 extends A052049 {

  @Override
  public Z next() {
    return super.next().square();
  }
}
