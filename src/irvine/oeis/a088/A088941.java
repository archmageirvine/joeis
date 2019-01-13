package irvine.oeis.a088;

import irvine.oeis.LinearRecurrence;

/**
 * A088941.
 * @author Sean A. Irvine
 */
public class A088941 extends LinearRecurrence {

  /** Construct the sequence. */
  public A088941() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 12, 54, 154, 349});
  }
}
