package irvine.oeis.a102;

import irvine.oeis.LinearRecurrence;

/**
 * A102591.
 * @author Sean A. Irvine
 */
public class A102591 extends LinearRecurrence {

  /** Construct the sequence. */
  public A102591() {
    super(new long[] {-4, 8}, new long[] {1, 6});
  }
}
