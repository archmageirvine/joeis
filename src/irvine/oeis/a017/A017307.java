package irvine.oeis.a017;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A017307 a(n) = (10*n + 3)^3.
 * @author Sean A. Irvine
 */
public class A017307 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017307() {
    super(new long[] {-1, 4, -6, 4}, new long[] {27, 2197, 12167, 35937});
  }
}
