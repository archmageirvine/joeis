package irvine.oeis.a006;

import irvine.oeis.a002.A002851;

/**
 * A006821 Number of connected regular graphs of degree <code>5</code> (or quintic graphs) with <code>2n</code> nodes.
 * @author Sean A. Irvine
 */
public class A006821 extends A002851 {

  @Override
  protected int degree() {
    return 5;
  }
}
