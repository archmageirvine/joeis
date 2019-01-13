package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164388.
 * @author Sean A. Irvine
 */
public class A164388 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164388() {
    super(new long[] {-1, 0, 1, 1, 1}, new long[] {1, 2, 4, 8, 14});
  }
}
