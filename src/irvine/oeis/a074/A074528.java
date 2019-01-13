package irvine.oeis.a074;

import irvine.oeis.LinearRecurrence;

/**
 * A074528.
 * @author Sean A. Irvine
 */
public class A074528 extends LinearRecurrence {

  /** Construct the sequence. */
  public A074528() {
    super(new long[] {36, -36, 11}, new long[] {3, 11, 49});
  }
}
