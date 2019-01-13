package irvine.oeis.a241;

import irvine.oeis.LinearRecurrence;

/**
 * A241407.
 * @author Sean A. Irvine
 */
public class A241407 extends LinearRecurrence {

  /** Construct the sequence. */
  public A241407() {
    super(new long[] {-1, 1, 1}, new long[] {27, 46, 100});
  }
}
