package irvine.oeis.a251;

import irvine.oeis.LinearRecurrence;

/**
 * A251770.
 * @author Sean A. Irvine
 */
public class A251770 extends LinearRecurrence {

  /** Construct the sequence. */
  public A251770() {
    super(new long[] {1, -1, -1442, 1442, 1}, new long[] {27, 378, 40365, 546516, 58207743});
  }
}
