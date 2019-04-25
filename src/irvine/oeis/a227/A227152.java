package irvine.oeis.a227;

import irvine.oeis.LinearRecurrence;

/**
 * A227152 Nonnegative solutions of the Pell equation <code>x^2 - 101*y^2 = +1.</code> Solutions <code>x = a(n)</code>.
 * @author Sean A. Irvine
 */
public class A227152 extends LinearRecurrence {

  /** Construct the sequence. */
  public A227152() {
    super(new long[] {-1, 402}, new long[] {1, 201});
  }
}
