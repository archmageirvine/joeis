package irvine.oeis.a112;

import irvine.oeis.LinearRecurrence;

/**
 * A112690 Expansion of <code>1/(1+x^2-x^3-x^5)</code>.
 * @author Sean A. Irvine
 */
public class A112690 extends LinearRecurrence {

  /** Construct the sequence. */
  public A112690() {
    super(new long[] {1, 0, 1, -1, 0}, new long[] {0, 1, 0, -1, 1});
  }
}
