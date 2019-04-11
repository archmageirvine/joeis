package irvine.oeis.a007;

import irvine.oeis.a011.A011804;

/**
 * A007625 Number of M-sequences from multicomplexes on at most 6 variables with no monomial of degree more than <code>n-1</code>.
 * @author Sean A. Irvine
 */
public class A007625 extends A011804 {

  @Override
  protected long start() {
    return -2;
  }

  @Override
  protected long variables() {
    return 6;
  }
}
