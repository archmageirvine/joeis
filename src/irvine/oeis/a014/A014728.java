package irvine.oeis.a014;

import irvine.math.z.Z;

/**
 * A014728 Squares of odd Fibonacci numbers.
 * @author Sean A. Irvine
 */
public class A014728 extends A014437 {

  @Override
  public Z next() {
    return super.next().square();
  }
}
