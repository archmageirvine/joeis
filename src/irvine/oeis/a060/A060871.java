package irvine.oeis.a060;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A060871 Number of n X n matrices over GF(7) with rank 1.
 * @author Sean A. Irvine
 */
public class A060871 extends LinearRecurrence {

  /** Construct the sequence. */
  public A060871() {
    super(1, new long[] {343, -399, 57}, new long[] {6, 384, 19494});
  }
}
