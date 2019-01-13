package irvine.oeis.a060;

import irvine.oeis.LinearRecurrence;

/**
 * A060544.
 * @author Sean A. Irvine
 */
public class A060544 extends LinearRecurrence {

  /** Construct the sequence. */
  public A060544() {
    super(new long[] {1, -3, 3}, new long[] {1, 10, 28});
  }
}
