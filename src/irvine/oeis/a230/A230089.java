package irvine.oeis.a230;

import irvine.oeis.LinearRecurrence;

/**
 * A230089 If n is divisible by 4 then 4, if n is divisible by 2 then 2, otherwise n.
 * @author Sean A. Irvine
 */
public class A230089 extends LinearRecurrence {

  /** Construct the sequence. */
  public A230089() {
    super(new long[] {-1, 0, 1, 0, 1, 0}, new long[] {1, 2, 3, 4, 5, 2});
  }
}
