package irvine.oeis.a019;

import irvine.oeis.a009.A009475;

/**
 * A019305 "Pascal sweep" for k=4: draw a horizontal line through the 1 at binomial(k,0) in Pascal's triangle; rotate this line and record the sum of the numbers on it (excluding the initial 1).
 * @author Sean A. Irvine
 */
public class A019305 extends A009475 {

  /** Construct the sequence. */
  public A019305() {
    super(0);
  }

  @Override
  protected long row() {
    return 4;
  }
}
