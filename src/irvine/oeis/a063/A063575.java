package irvine.oeis.a063;

import irvine.oeis.a031.A031146;

/**
 * A063575 Smallest k such that 4^k has exactly n 0's in its decimal representation.
 * @author Sean A. Irvine
 */
public class A063575 extends A031146 {

  @Override
  protected long base() {
    return 4;
  }
}

