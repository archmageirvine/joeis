package irvine.oeis.a084;

import irvine.oeis.LinearRecurrence;

/**
 * A084859 Binomial transform of Cullen numbers <code>A002064</code>.
 * @author Sean A. Irvine
 */
public class A084859 extends LinearRecurrence {

  /** Construct the sequence. */
  public A084859() {
    super(new long[] {18, -21, 8}, new long[] {1, 4, 16});
  }
}
