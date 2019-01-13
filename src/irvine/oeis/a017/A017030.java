package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017030.
 * @author Sean A. Irvine
 */
public class A017030 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017030() {
    super(new long[] {1, -3, 3}, new long[] {16, 121, 324});
  }
}
