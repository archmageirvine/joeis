package irvine.oeis.a028;

import irvine.oeis.LinearRecurrence;

/**
 * A028126.
 * @author Sean A. Irvine
 */
public class A028126 extends LinearRecurrence {

  /** Construct the sequence. */
  public A028126() {
    super(new long[] {-2160, 1392, -317, 30}, new long[] {1, 30, 583, 9372});
  }
}
