package irvine.oeis.a063;

import irvine.oeis.a031.A031146;

/**
 * A063596 Least k <code>&gt;= 0</code> such that <code>6^k</code> has exactly <code>n 0</code>'s in its decimal representation.
 * @author Sean A. Irvine
 */
public class A063596 extends A031146 {

  @Override
  protected long base() {
    return 6;
  }
}

