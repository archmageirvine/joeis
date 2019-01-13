package irvine.oeis.a133;

import irvine.oeis.LinearRecurrence;

/**
 * A133271.
 * @author Sean A. Irvine
 */
public class A133271 extends LinearRecurrence {

  /** Construct the sequence. */
  public A133271() {
    super(new long[] {1, -13, 13}, new long[] {1, 8, 92});
  }
}
