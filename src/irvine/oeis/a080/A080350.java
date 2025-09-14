package irvine.oeis.a080;

import irvine.math.cr.CR;
import irvine.oeis.a079.A079366;

/**
 * A080350 Cost\u00e9 prime expansion of 1/Pi.
 * @author Sean A. Irvine
 */
public class A080350 extends A079366 {

  /** Construct the sequence. */
  public A080350() {
    super(CR.PI.inverse());
  }
}
