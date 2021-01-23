package irvine.oeis.a007;

import irvine.oeis.a011.A011804;

/**
 * A007065 Number of M-sequences from multicomplexes on at most 5 variables with no monomial of degree greater than n.
 * @author Sean A. Irvine
 */
public class A007065 extends A011804 {

  @Override
  protected long start() {
    return -2;
  }

  @Override
  protected long variables() {
    return 5;
  }
}
