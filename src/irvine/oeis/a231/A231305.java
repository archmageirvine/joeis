package irvine.oeis.a231;

import irvine.oeis.LinearRecurrence;

/**
 * A231305 Recurrence <code>a(n) = a(n-2) +</code> n^M for M=6, starting with <code>a(0)=0, a(1)=1</code>.
 * @author Sean A. Irvine
 */
public class A231305 extends LinearRecurrence {

  /** Construct the sequence. */
  public A231305() {
    super(new long[] {-1, 8, -28, 56, -70, 56, -28, 8}, new long[] {0, 1, 64, 730, 4160, 16355, 50816, 134004});
  }
}
