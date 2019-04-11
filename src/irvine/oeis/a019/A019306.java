package irvine.oeis.a019;

import irvine.oeis.a009.A009475;

/**
 * A019306 "Pascal sweep" for k=5: draw a horizontal line through the 1 at C(k,0) in Pascal's triangle; rotate this line and record the sum of the numbers on it (excluding the initial <code>1)</code>.
 * @author Sean A. Irvine
 */
public class A019306 extends A009475 {

  @Override
  protected long row() {
    return 5;
  }
}
