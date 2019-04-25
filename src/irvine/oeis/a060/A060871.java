package irvine.oeis.a060;

import irvine.oeis.LinearRecurrence;

/**
 * A060871 Number of n X n matrices over <code>GF(7)</code> with rank 1.
 * @author Sean A. Irvine
 */
public class A060871 extends LinearRecurrence {

  /** Construct the sequence. */
  public A060871() {
    super(new long[] {343, -399, 57}, new long[] {6, 384, 19494});
  }
}
