package irvine.oeis.a214;

import irvine.oeis.LinearRecurrence;

/**
 * A214994 Power ceiling sequence of <code>(golden ratio)^5</code>.
 * @author Sean A. Irvine
 */
public class A214994 extends LinearRecurrence {

  /** Construct the sequence. */
  public A214994() {
    super(new long[] {-1, -10, 12}, new long[] {12, 134, 1487});
  }
}
