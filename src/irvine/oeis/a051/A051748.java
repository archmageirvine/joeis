package irvine.oeis.a051;

import irvine.oeis.a006.A006907;

/**
 * A051748.
 * @author Sean A. Irvine
 */
public class A051748 extends A006907 {

  @Override
  protected boolean accept(final int v) {
    return v < 0;
  }
}
