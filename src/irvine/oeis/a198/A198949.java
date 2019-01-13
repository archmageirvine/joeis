package irvine.oeis.a198;

import irvine.oeis.LinearRecurrence;

/**
 * A198949.
 * @author Sean A. Irvine
 */
public class A198949 extends LinearRecurrence {

  /** Construct the sequence. */
  public A198949() {
    super(new long[] {-1, 0, 20, 0}, new long[] {1, 23, 43, 461});
  }
}
