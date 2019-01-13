package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017067.
 * @author Sean A. Irvine
 */
public class A017067 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017067() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 512, 4096, 13824});
  }
}
