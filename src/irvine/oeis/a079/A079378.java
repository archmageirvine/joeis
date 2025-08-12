package irvine.oeis.a079;

import irvine.math.cr.CR;

/**
 * A079378 Cost\u00e9 prime expansion of (sqrt(5)-1)/2.
 * @author Sean A. Irvine
 */
public class A079378 extends A079366 {

  /** Construct the sequence. */
  public A079378() {
    super(CR.FIVE.sqrt().subtract(1).divide(2));
  }
}
