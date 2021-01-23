package irvine.oeis.a289;

import irvine.oeis.LinearRecurrence;

/**
 * A289785 p-INVERT of the (5^n), where p(S) = 1 - S - S^2.
 * @author Sean A. Irvine
 */
public class A289785 extends LinearRecurrence {

  /** Construct the sequence. */
  public A289785() {
    super(new long[] {-29, 11}, new long[] {1, 7});
  }
}
