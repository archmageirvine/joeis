package irvine.oeis.a060;

import irvine.oeis.LinearRecurrence;

/**
 * A060870 Number of n X n matrices over GF(5) with rank 1.
 * @author Sean A. Irvine
 */
public class A060870 extends LinearRecurrence {

  /** Construct the sequence. */
  public A060870() {
    super(new long[] {125, -155, 31}, new long[] {4, 144, 3844});
  }
}
