package irvine.oeis.a019;

import irvine.oeis.a009.A009475;

/**
 * A019305 "Pascal sweep" for <code>k=4</code>: draw a horizontal line through the 1 at <code>binomial(k,0)</code> in Pascal's triangle; rotate this line and record the sum of the numbers on it (excluding the initial <code>1)</code>.
 * @author Sean A. Irvine
 */
public class A019305 extends A009475 {

  @Override
  protected long row() {
    return 4;
  }
}
