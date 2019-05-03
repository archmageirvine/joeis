package irvine.oeis.a093;

import irvine.oeis.a094.A094153;

/**
 * A093782 <code>a(n)</code> is the smallest initial value <code>(a prime)</code> for the <code>Euclid-Mullin (EM)</code> sequence in which the <code>p=5</code> prime emerges as n-th term, i.e., arises at the n-th position.
 * @author Sean A. Irvine
 */
public class A093782 extends A094153 {

  @Override
  protected long target() {
    return 5;
  }
}
