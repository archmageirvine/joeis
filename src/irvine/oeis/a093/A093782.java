package irvine.oeis.a093;

import irvine.oeis.a094.A094153;

/**
 * A093782 a(n) is the smallest initial value (a prime) for the Euclid-Mullin (EM) sequence in which the p=5 prime emerges as n-th term, i.e., arises at the n-th position.
 * @author Sean A. Irvine
 */
public class A093782 extends A094153 {

  @Override
  protected long target() {
    return 5;
  }
}
