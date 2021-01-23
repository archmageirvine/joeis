package irvine.oeis.a219;

import irvine.oeis.LinearRecurrence;

/**
 * A219977 Expansion of 1/(1+x+x^2+x^3).
 * @author Sean A. Irvine
 */
public class A219977 extends LinearRecurrence {

  /** Construct the sequence. */
  public A219977() {
    super(new long[] {-1, -1, -1}, new long[] {1, -1, 0});
  }
}
