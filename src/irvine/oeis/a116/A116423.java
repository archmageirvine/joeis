package irvine.oeis.a116;

import irvine.oeis.LinearRecurrence;

/**
 * A116423 Binomial transform of <code>A006053</code>.
 * @author Sean A. Irvine
 */
public class A116423 extends LinearRecurrence {

  /** Construct the sequence. */
  public A116423() {
    super(new long[] {-1, -3, 4}, new long[] {0, 1, 3});
  }
}
