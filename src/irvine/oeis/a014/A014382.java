package irvine.oeis.a014;

import irvine.oeis.a002.A002851;

/**
 * A014382 Number of connected regular graphs of degree 10 with n nodes.
 * @author Sean A. Irvine
 */
public class A014382 extends A002851 {

  @Override
  protected int degree() {
    return 10;
  }
}
