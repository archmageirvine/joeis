package irvine.oeis.a014;

import irvine.oeis.a002.A002851;

/**
 * A014377 Number of connected regular graphs of degree 7 with 2n nodes.
 * @author Sean A. Irvine
 */
public class A014377 extends A002851 {

  @Override
  protected int degree() {
    return 7;
  }
}
