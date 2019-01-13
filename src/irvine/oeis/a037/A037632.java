package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037632.
 * @author Sean A. Irvine
 */
public class A037632 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037632() {
    super(new long[] {-4, 1, 0, 4}, new long[] {2, 9, 39, 158});
  }
}
