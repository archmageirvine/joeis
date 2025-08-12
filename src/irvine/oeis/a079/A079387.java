package irvine.oeis.a079;

import irvine.math.cr.CR;

/**
 * A079387 Cost\u00e9 prime expansion of sqrt(3) - 1.
 * @author Sean A. Irvine
 */
public class A079387 extends A079366 {

  /** Construct the sequence. */
  public A079387() {
    super(CR.THREE.sqrt().subtract(1));
  }
}
