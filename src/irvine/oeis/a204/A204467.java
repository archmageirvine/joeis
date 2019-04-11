package irvine.oeis.a204;

import irvine.oeis.LinearRecurrence;

/**
 * A204467 Number of 3-element subsets that can be chosen from <code>{1,2,...,6*n+3}</code> having element sum <code>9*n+6</code>.
 * @author Sean A. Irvine
 */
public class A204467 extends LinearRecurrence {

  /** Construct the sequence. */
  public A204467() {
    super(new long[] {1, -2, 0, 2}, new long[] {1, 8, 25, 50});
  }
}
