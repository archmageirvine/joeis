package irvine.oeis.a063;

import irvine.oeis.a031.A031146;

/**
 * A063626 Smallest k &gt;= 0 such that 9^k has exactly n 0's in its decimal representation.
 * @author Sean A. Irvine
 */
public class A063626 extends A031146 {

  @Override
  protected long base() {
    return 9;
  }
}

