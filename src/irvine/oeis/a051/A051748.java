package irvine.oeis.a051;

import irvine.oeis.a006.A006907;

/**
 * A051748 Number of character table entries of the symmetric group S_n which are <code>&lt; 0</code>.
 * @author Sean A. Irvine
 */
public class A051748 extends A006907 {

  @Override
  protected boolean accept(final int v) {
    return v < 0;
  }
}
