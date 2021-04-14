package irvine.oeis.a046;

import irvine.math.q.Q;

/**
 * A046601 First numerator and then denominator of the 1/5-Pascal triangle (by row). To get a 1/5-Pascal triangle, replace "2" in the third row of the Pascal triangle with "1/5" and calculate all other rows as in the Pascal triangle.
 * @author Sean A. Irvine
 */
public class A046601 extends A046213 {

  @Override
  protected Q rat() {
    return new Q(1, 5);
  }
}
