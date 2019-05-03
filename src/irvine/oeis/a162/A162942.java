package irvine.oeis.a162;

import irvine.oeis.LinearRecurrence;

/**
 * A162942 <code>Binomial[n + 1, 2]*7^2 </code>.
 * @author Sean A. Irvine
 */
public class A162942 extends LinearRecurrence {

  /** Construct the sequence. */
  public A162942() {
    super(new long[] {1, -3, 3}, new long[] {0, 49, 147});
  }
}
