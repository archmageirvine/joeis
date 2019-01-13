package irvine.oeis.a020;

import irvine.oeis.LinearRecurrence;

/**
 * A020978.
 * @author Sean A. Irvine
 */
public class A020978 extends LinearRecurrence {

  /** Construct the sequence. */
  public A020978() {
    super(new long[] {864, -276, 29}, new long[] {1, 29, 565});
  }
}
