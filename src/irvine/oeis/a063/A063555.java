package irvine.oeis.a063;

import irvine.oeis.a031.A031146;

/**
 * A063555 Smallest k such that 3^k has exactly n 0's in its decimal representation.
 * @author Sean A. Irvine
 */
public class A063555 extends A031146 {

  @Override
  protected long base() {
    return 3;
  }
}

