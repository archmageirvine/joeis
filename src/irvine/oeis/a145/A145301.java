package irvine.oeis.a145;

import irvine.oeis.LinearRecurrence;

/**
 * A145301.
 * @author Sean A. Irvine
 */
public class A145301 extends LinearRecurrence {

  /** Construct the sequence. */
  public A145301() {
    super(new long[] {-30, 12}, new long[] {1, 6});
  }
}
