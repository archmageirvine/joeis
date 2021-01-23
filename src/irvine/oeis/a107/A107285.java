package irvine.oeis.a107;

import irvine.oeis.LinearRecurrence;

/**
 * A107285 5*401*(10^n + 1).
 * @author Sean A. Irvine
 */
public class A107285 extends LinearRecurrence {

  /** Construct the sequence. */
  public A107285() {
    super(new long[] {-10, 11}, new long[] {4010, 22055});
  }
}
