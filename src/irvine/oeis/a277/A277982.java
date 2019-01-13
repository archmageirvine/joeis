package irvine.oeis.a277;

import irvine.oeis.LinearRecurrence;

/**
 * A277982.
 * @author Sean A. Irvine
 */
public class A277982 extends LinearRecurrence {

  /** Construct the sequence. */
  public A277982() {
    super(new long[] {1, -3, 3}, new long[] {-30, -8, 38});
  }
}
