package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017139.
 * @author Sean A. Irvine
 */
public class A017139 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017139() {
    super(new long[] {-1, 4, -6, 4}, new long[] {216, 2744, 10648, 27000});
  }
}
