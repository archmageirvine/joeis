package irvine.oeis.a172;

import irvine.math.z.Z;
import irvine.oeis.a008.A008300;

/**
 * A172541 Number of n X n 0..1 arrays with row sums 7 and column sums 7.
 * @author Sean A. Irvine
 */
public class A172541 extends A008300 {

  /** Construct the sequence. */
  public A172541() {
    super(1);
  }

  private int mN = 0;

  @Override
  public Z next() {
    return t(++mN, 7);
  }
}
