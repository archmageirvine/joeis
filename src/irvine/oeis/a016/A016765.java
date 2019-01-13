package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016765.
 * @author Sean A. Irvine
 */
public class A016765 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016765() {
    super(new long[] {72, -54, 13}, new long[] {1, 13, 115});
  }
}
