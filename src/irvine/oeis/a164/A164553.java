package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164553.
 * @author Sean A. Irvine
 */
public class A164553 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164553() {
    super(new long[] {-43, 14}, new long[] {1, 11});
  }
}
