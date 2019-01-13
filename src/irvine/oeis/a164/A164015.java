package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164015.
 * @author Sean A. Irvine
 */
public class A164015 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164015() {
    super(new long[] {1, -3, 3}, new long[] {5, 30, 80});
  }
}
