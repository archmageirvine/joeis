package irvine.oeis.a125;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A125729 Numbers whose base 7 representation is 555....5.
 * @author Sean A. Irvine
 */
public class A125729 extends LinearRecurrence {

  /** Construct the sequence. */
  public A125729() {
    super(new long[] {-7, 8}, new long[] {0, 5});
  }
}
