package irvine.oeis.a000;

import irvine.math.cr.CR;

/**
 * A000923.
 * @author Sean A. Irvine
 */
public class A000923 extends A000921 {

  @Override
  protected boolean compare(final CR s, final CR p) {
    return s.signum() < 0 && s.multiply(s).compareTo(p) > 0;
  }
}
