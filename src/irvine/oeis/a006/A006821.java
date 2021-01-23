package irvine.oeis.a006;

import irvine.oeis.a002.A002851;

/**
 * A006821 Number of connected regular graphs of degree 5 (or quintic graphs) with 2n nodes.
 * @author Sean A. Irvine
 */
public class A006821 extends A002851 {

  @Override
  protected int degree() {
    return 5;
  }
}
