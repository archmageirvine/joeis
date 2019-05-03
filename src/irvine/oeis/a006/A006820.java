package irvine.oeis.a006;

import irvine.oeis.a002.A002851;

/**
 * A006820 Number of connected regular simple graphs of degree <code>4</code> (or quartic graphs) with n nodes.
 * @author Sean A. Irvine
 */
public class A006820 extends A002851 {

  @Override
  protected int degree() {
    return 4;
  }
}
