package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016816.
 * @author Sean A. Irvine
 */
public class A016816 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016816() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {1, 625, 6561, 28561, 83521});
  }
}
