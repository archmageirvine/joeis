package irvine.oeis.a230;

import irvine.oeis.LinearRecurrence;

/**
 * A230368 A strong divisibility sequence associated with the algebraic integer 1 + i.
 * @author Sean A. Irvine
 */
public class A230368 extends LinearRecurrence {

  /** Construct the sequence. */
  public A230368() {
    super(new long[] {-4, 0, 0, 0, 1, 0, 0, 0, 4, 0, 0, 0}, new long[] {1, 1, 1, 5, 1, 1, 1, 15, 1, 1, 1, 65});
  }
}
