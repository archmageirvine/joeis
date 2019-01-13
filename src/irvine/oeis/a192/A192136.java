package irvine.oeis.a192;

import irvine.oeis.LinearRecurrence;

/**
 * A192136.
 * @author Sean A. Irvine
 */
public class A192136 extends LinearRecurrence {

  /** Construct the sequence. */
  public A192136() {
    super(new long[] {1, -3, 3}, new long[] {1, 2, 8});
  }
}
