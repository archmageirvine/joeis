package irvine.oeis.a133;

import irvine.oeis.LinearRecurrence;

/**
 * A133417.
 * @author Sean A. Irvine
 */
public class A133417 extends LinearRecurrence {

  /** Construct the sequence. */
  public A133417() {
    super(new long[] {-1, 5, 5}, new long[] {2, 8, 42});
  }
}
