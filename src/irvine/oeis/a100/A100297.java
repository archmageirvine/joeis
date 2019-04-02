package irvine.oeis.a100;

import irvine.oeis.LinearRecurrence;

/**
 * A100297 Sequence generated from a symmetric matrix composed of Catalan numbers.
 * @author Sean A. Irvine
 */
public class A100297 extends LinearRecurrence {

  /** Construct the sequence. */
  public A100297() {
    super(new long[] {1, -14, 17}, new long[] {1, 6, 89});
  }
}
