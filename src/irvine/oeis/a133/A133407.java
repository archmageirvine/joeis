package irvine.oeis.a133;

import irvine.oeis.LinearRecurrence;

/**
 * A133407.
 * @author Sean A. Irvine
 */
public class A133407 extends LinearRecurrence {

  /** Construct the sequence. */
  public A133407() {
    super(new long[] {5, 1}, new long[] {1, 2});
  }
}
