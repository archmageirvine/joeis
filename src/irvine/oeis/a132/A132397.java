package irvine.oeis.a132;

import irvine.oeis.LinearRecurrence;

/**
 * A132397 Second trisection of <code>A024494</code>.
 * @author Sean A. Irvine
 */
public class A132397 extends LinearRecurrence {

  /** Construct the sequence. */
  public A132397() {
    super(new long[] {8, 7}, new long[] {2, 10});
  }
}
