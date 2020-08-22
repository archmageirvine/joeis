package irvine.oeis.a003;

import irvine.oeis.a002.A002845;

/**
 * A003019 Number of distinct values taken by 4^4^...^4 (with n 4's and parentheses inserted in all possible ways).
 * @author Sean A. Irvine
 */
public class A003019 extends A002845 {

  @Override
  protected long base() {
    return 4;
  }
}
