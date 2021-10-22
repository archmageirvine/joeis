package irvine.oeis.a052;

import irvine.math.z.Z;

/**
 * A052096 Squares whose decimal expansion digits occur with an exact frequency of 3.
 * @author Sean A. Irvine
 */
public class A052096 extends A052095 {

  @Override
  public Z next() {
    return super.next().square();
  }
}

