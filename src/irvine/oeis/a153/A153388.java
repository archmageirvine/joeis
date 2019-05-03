package irvine.oeis.a153;

import irvine.oeis.LinearRecurrence;

/**
 * A153388 Second bisection of <code>A153382</code>.
 * @author Sean A. Irvine
 */
public class A153388 extends LinearRecurrence {

  /** Construct the sequence. */
  public A153388() {
    super(new long[] {1, -4, 4}, new long[] {8, 18, 48});
  }
}
