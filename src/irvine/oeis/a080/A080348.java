package irvine.oeis.a080;

import irvine.oeis.a006.A006752;
import irvine.oeis.a079.A079366;

/**
 * A080348 Cost\u00e9 prime expansion of Catalan's constant.
 * @author Sean A. Irvine
 */
public class A080348 extends A079366 {

  /** Construct the sequence. */
  public A080348() {
    super(new A006752().getCR());
  }
}
