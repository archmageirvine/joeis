package irvine.oeis.a273;

import irvine.oeis.LinearRecurrence;

/**
 * A273189.
 * @author Sean A. Irvine
 */
public class A273189 extends LinearRecurrence {

  /** Construct the sequence. */
  public A273189() {
    super(new long[] {1, -7, 7}, new long[] {51, 401, 2451});
  }
}
