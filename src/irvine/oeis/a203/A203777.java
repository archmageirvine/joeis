package irvine.oeis.a203;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A203777 Aliquot sequence starting at 220.
 * @author Sean A. Irvine
 */
public class A203777 extends LinearRecurrence {

  /** Construct the sequence. */
  public A203777() {
    super(new long[] {1, 0}, new long[] {220, 284});
  }
}
