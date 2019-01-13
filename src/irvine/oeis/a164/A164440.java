package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164440.
 * @author Sean A. Irvine
 */
public class A164440 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164440() {
    super(new long[] {1, -1, 1, -1, 2}, new long[] {13, 22, 37, 62, 104});
  }
}
