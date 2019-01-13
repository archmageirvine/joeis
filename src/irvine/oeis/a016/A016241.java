package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016241.
 * @author Sean A. Irvine
 */
public class A016241 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016241() {
    super(new long[] {42, -55, 14}, new long[] {1, 14, 141});
  }
}
