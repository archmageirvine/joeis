package irvine.oeis.a052;

import irvine.oeis.a033.A033447;

/**
 * A052243 Initial prime in set of (at least) 4 consecutive primes in arithmetic progression with difference 30.
 * @author Sean A. Irvine
 */
public class A052243 extends A033447 {

  @Override
  protected int diff() {
    return 30;
  }
}

