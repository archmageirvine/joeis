package irvine.oeis.a120;

import irvine.oeis.LinearRecurrence;

/**
 * A120464.
 * @author Sean A. Irvine
 */
public class A120464 extends LinearRecurrence {

  /** Construct the sequence. */
  public A120464() {
    super(new long[] {-2, 1, 5}, new long[] {0, 2, 11});
  }
}
