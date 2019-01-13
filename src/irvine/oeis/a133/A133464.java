package irvine.oeis.a133;

import irvine.oeis.LinearRecurrence;

/**
 * A133464.
 * @author Sean A. Irvine
 */
public class A133464 extends LinearRecurrence {

  /** Construct the sequence. */
  public A133464() {
    super(new long[] {4, 0, 0}, new long[] {1, 2, 3});
  }
}
