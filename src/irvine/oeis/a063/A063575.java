package irvine.oeis.a063;

import irvine.oeis.a031.A031146;

/**
 * A063575 Smallest k such that <code>4^k</code> has exactly <code>n 0</code>'s in its decimal representation.
 * @author Sean A. Irvine
 */
public class A063575 extends A031146 {

  @Override
  protected long base() {
    return 4;
  }
}

