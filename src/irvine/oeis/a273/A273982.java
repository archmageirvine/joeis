package irvine.oeis.a273;

import irvine.oeis.LinearRecurrence;

/**
 * A273982.
 * @author Sean A. Irvine
 */
public class A273982 extends LinearRecurrence {

  /** Construct the sequence. */
  public A273982() {
    super(new long[] {1, -3, 3}, new long[] {1, 8, 25});
  }
}
