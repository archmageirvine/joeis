package irvine.oeis.a014;

import irvine.oeis.a002.A002851;

/**
 * A014381 Number of connected regular graphs of degree 9 with 2n nodes.
 * @author Sean A. Irvine
 */
public class A014381 extends A002851 {

  @Override
  protected int degree() {
    return 9;
  }
}
