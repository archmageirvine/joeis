package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037722.
 * @author Sean A. Irvine
 */
public class A037722 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037722() {
    super(new long[] {-10, 11, -11, 11}, new long[] {2, 20, 201, 2013});
  }
}
