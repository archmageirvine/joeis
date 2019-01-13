package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016924.
 * @author Sean A. Irvine
 */
public class A016924 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016924() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {1, 2401, 28561, 130321, 390625});
  }
}
