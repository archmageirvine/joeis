package irvine.oeis.a227;

import irvine.oeis.LinearRecurrence;

/**
 * A227151 Nonnegative solutions of the Pell equation <code>x^2 - 97*y^2 = +1.</code> Solutions <code>y = 6377352*a(n)</code>.
 * @author Sean A. Irvine
 */
public class A227151 extends LinearRecurrence {

  /** Construct the sequence. */
  public A227151() {
    super(new long[] {-1, 125619266}, new long[] {0, 1});
  }
}
