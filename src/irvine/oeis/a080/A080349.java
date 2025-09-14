package irvine.oeis.a080;

import irvine.math.cr.CR;
import irvine.oeis.a079.A079366;

/**
 * A080349 Cost\u00e9 prime expansion of Pi-e.
 * @author Sean A. Irvine
 */
public class A080349 extends A079366 {

  /** Construct the sequence. */
  public A080349() {
    super(CR.PI.subtract(CR.E));
  }
}
