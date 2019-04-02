package irvine.oeis.a014;

import irvine.math.z.Z;

/**
 * A014773 Squares of odd heptagonal numbers.
 * @author Sean A. Irvine
 */
public class A014773 extends A014637 {

  @Override
  public Z next() {
    return super.next().square();
  }
}
