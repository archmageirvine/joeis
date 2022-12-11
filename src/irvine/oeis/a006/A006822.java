package irvine.oeis.a006;

import irvine.oeis.a002.A002851;

/**
 * A006822 Number of connected regular graphs of degree 6 (or sextic graphs) with n nodes.
 * @author Sean A. Irvine
 */
public class A006822 extends A002851 {

  @Override
  protected int degree() {
    return 6;
  }
}
