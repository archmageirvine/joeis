package irvine.oeis.a051;

import irvine.oeis.a006.A006907;

/**
 * A051749 Number of character table entries of the symmetric group <code>S_n</code> which are <code>&gt; 0</code>.
 * @author Sean A. Irvine
 */
public class A051749 extends A006907 {

  @Override
  protected boolean accept(final int v) {
    return v > 0;
  }
}
