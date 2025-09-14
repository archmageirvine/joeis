package irvine.oeis.a080;

import irvine.math.cr.CR;
import irvine.oeis.a079.A079366;

/**
 * A080351 Cost\u00e9 prime expansion of 1/exp(1).
 * @author Sean A. Irvine
 */
public class A080351 extends A079366 {

  /** Construct the sequence. */
  public A080351() {
    super(CR.E.inverse());
  }
}
