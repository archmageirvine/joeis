package irvine.oeis.a079;

import irvine.math.cr.CR;
import irvine.math.q.Q;

/**
 * A079384 Cost\u00e9 prime expansion of 2^(1/3) - 1.
 * @author Sean A. Irvine
 */
public class A079384 extends A079366 {

  /** Construct the sequence. */
  public A079384() {
    super(CR.TWO.pow(Q.ONE_THIRD).subtract(1));
  }
}
