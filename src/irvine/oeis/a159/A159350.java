package irvine.oeis.a159;

import irvine.oeis.LinearRecurrence;

/**
 * A159350.
 * @author Sean A. Irvine
 */
public class A159350 extends LinearRecurrence {

  /** Construct the sequence. */
  public A159350() {
    super(new long[] {1, -2, 4, -3, 3}, new long[] {1, 1, 1, 4, 11});
  }
}
