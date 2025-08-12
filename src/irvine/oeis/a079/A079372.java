package irvine.oeis.a079;

import irvine.math.cr.CR;

/**
 * A079372 Cost\u00e9 prime expansion of sqrt(2) - 1.
 * @author Sean A. Irvine
 */
public class A079372 extends A079366 {

  /** Construct the sequence. */
  public A079372() {
    super(CR.SQRT2.subtract(1));
  }
}
