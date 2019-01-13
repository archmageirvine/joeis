package irvine.oeis.a188;

import irvine.oeis.LinearRecurrence;

/**
 * A188377.
 * @author Sean A. Irvine
 */
public class A188377 extends LinearRecurrence {

  /** Construct the sequence. */
  public A188377() {
    super(new long[] {-1, 4, -6, 4}, new long[] {7, 22, 53, 106});
  }
}
