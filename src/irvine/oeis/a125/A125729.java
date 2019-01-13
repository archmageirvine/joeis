package irvine.oeis.a125;

import irvine.oeis.LinearRecurrence;

/**
 * A125729.
 * @author Sean A. Irvine
 */
public class A125729 extends LinearRecurrence {

  /** Construct the sequence. */
  public A125729() {
    super(new long[] {-7, 8}, new long[] {0, 5});
  }
}
