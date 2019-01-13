package irvine.oeis.a161;

import irvine.oeis.LinearRecurrence;

/**
 * A161617.
 * @author Sean A. Irvine
 */
public class A161617 extends LinearRecurrence {

  /** Construct the sequence. */
  public A161617() {
    super(new long[] {1, -3, 3}, new long[] {1, 29, 73});
  }
}
