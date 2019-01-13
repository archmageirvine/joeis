package irvine.oeis.a133;

import irvine.oeis.LinearRecurrence;

/**
 * A133190.
 * @author Sean A. Irvine
 */
public class A133190 extends LinearRecurrence {

  /** Construct the sequence. */
  public A133190() {
    super(new long[] {2, -1, 2}, new long[] {1, 3, 3});
  }
}
