package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042106.
 * @author Sean A. Irvine
 */
public class A042106 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042106() {
    super(new long[] {-1, 0, 1154, 0}, new long[] {24, 577, 27720, 665857});
  }
}
