package irvine.oeis.a107;
// manually knest/jaguarz at 2023-03-01 20:54

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a007.A007539;

/**
 * A107481 Number of different prime factors of the smallest n-perfect number.
 * @author Georg Fischer
 */
public class A107481 extends A007539 {

  private int mN = 0;

  @Override
  public Z next() {
    final Z t = Z.valueOf(Functions.OMEGA.i(super.next()));
    return (++mN == 1) ? Z.ONE : t;
  }
}
