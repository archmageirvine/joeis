package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.a257.A257493;

/**
 * A008552 Number of 7 X 7 stochastic matrices of integers.
 * @author Sean A. Irvine
 */
public class A008552 extends A257493 {

  private int mN = -1;

  @Override
  public Z next() {
    return a(7, ++mN);
  }
}
