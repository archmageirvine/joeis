package irvine.oeis.a112;

import irvine.oeis.LinearRecurrence;

/**
 * A112525 Expansion of <code>1/(1-100x^2-100x^3)</code>.
 * @author Sean A. Irvine
 */
public class A112525 extends LinearRecurrence {

  /** Construct the sequence. */
  public A112525() {
    super(new long[] {100, 100, 0}, new long[] {1, 0, 100});
  }
}
