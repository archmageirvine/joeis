package irvine.oeis.a271;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A271970 Linear recurrence, with both signature and original terms = 1,0,1,0,1.
 * @author Sean A. Irvine
 */
public class A271970 extends LinearRecurrence {

  /** Construct the sequence. */
  public A271970() {
    super(1, new long[] {1, 0, 1, 0, 1}, new long[] {1, 0, 1, 0, 1});
  }
}
