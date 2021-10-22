package irvine.oeis.a052;

import irvine.math.z.Z;

/**
 * A052098 Squares whose decimal expansion digits occur with an exact frequency of 4.
 * @author Sean A. Irvine
 */
public class A052098 extends A052097 {

  @Override
  public Z next() {
    return super.next().square();
  }
}

