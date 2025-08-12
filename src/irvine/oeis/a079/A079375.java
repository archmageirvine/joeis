package irvine.oeis.a079;

import irvine.math.cr.CR;

/**
 * A079375 Cost\u00e9 prime expansion of Pi^2 - 9.
 * @author Sean A. Irvine
 */
public class A079375 extends A079366 {

  /** Construct the sequence. */
  public A079375() {
    super(CR.PI.square().subtract(9));
  }
}
