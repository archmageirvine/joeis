package irvine.oeis.a133;

import irvine.oeis.LinearRecurrence;

/**
 * A133161.
 * @author Sean A. Irvine
 */
public class A133161 extends LinearRecurrence {

  /** Construct the sequence. */
  public A133161() {
    super(new long[] {1, -5, 5}, new long[] {1, 4, 16});
  }
}
