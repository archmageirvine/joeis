package irvine.oeis.a028;

import irvine.math.z.Z;

/**
 * A028666 a(n) = order of the orthogonal group O_n(2) if n is odd or O^(+)_n(2) if n is even.
 * @author Sean A. Irvine
 */
public class A028666 extends A028665 {

  @Override
  protected Z power() {
    return Z.FOUR;
  }

  @Override
  protected int start() {
    return -1;
  }
}
