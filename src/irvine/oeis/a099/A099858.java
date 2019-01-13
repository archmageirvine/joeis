package irvine.oeis.a099;

import irvine.oeis.LinearRecurrence;

/**
 * A099858.
 * @author Sean A. Irvine
 */
public class A099858 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099858() {
    super(new long[] {-1, 3, -2, 3}, new long[] {1, 6, 17, 42});
  }
}
