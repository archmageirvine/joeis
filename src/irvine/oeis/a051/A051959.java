package irvine.oeis.a051;

import irvine.oeis.LinearRecurrence;

/**
 * A051959.
 * @author Sean A. Irvine
 */
public class A051959 extends LinearRecurrence {

  /** Construct the sequence. */
  public A051959() {
    super(new long[] {1, 0, -4, 4}, new long[] {1, 10, 36, 104});
  }
}
