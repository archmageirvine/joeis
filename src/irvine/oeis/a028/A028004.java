package irvine.oeis.a028;

import irvine.oeis.LinearRecurrence;

/**
 * A028004.
 * @author Sean A. Irvine
 */
public class A028004 extends LinearRecurrence {

  /** Construct the sequence. */
  public A028004() {
    super(new long[] {-1584, 1332, -328, 31}, new long[] {1, 31, 633, 10787});
  }
}
