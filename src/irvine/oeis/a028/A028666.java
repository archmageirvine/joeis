package irvine.oeis.a028;

import irvine.math.z.Z;

/**
 * A028666 <code>a(n) =</code> order of the orthogonal group <code>O_n(2)</code> if n is odd or <code>O^(+)_n(2)</code> if n is even.
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
