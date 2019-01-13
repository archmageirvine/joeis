package irvine.oeis.a123;

import irvine.oeis.LinearRecurrence;

/**
 * A123720.
 * @author Sean A. Irvine
 */
public class A123720 extends LinearRecurrence {

  /** Construct the sequence. */
  public A123720() {
    super(new long[] {2, -5, 4}, new long[] {2, 4, 9});
  }
}
