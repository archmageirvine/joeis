package irvine.oeis.a000;

import irvine.math.cr.CR;

/**
 * A000922.
 * @author Sean A. Irvine
 */
public class A000922 extends A000921 {

  @Override
  protected boolean compare(final CR s, final CR p) {
    return s.multiply(s).compareTo(p) <= 0;
  }
}
