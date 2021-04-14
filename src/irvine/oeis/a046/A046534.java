package irvine.oeis.a046;

import irvine.math.q.Q;

/**
 * A046534 First numerator and then denominator of the 1/3-Pascal triangle (by row). To get a 1/3-Pascal triangle, replace "2" in the third row of the Pascal triangle with "1/3" and calculate all other rows as in the Pascal triangle.
 * @author Sean A. Irvine
 */
public class A046534 extends A046213 {

  @Override
  protected Q rat() {
    return Q.ONE_THIRD;
  }
}
