package irvine.oeis.a140;

import irvine.oeis.LinearRecurrence;

/**
 * A140413 <code>a(2n) =</code> A000045(6n)+1, <code>a(2n+1) =</code> A000045(6n+3)-1.
 * @author Sean A. Irvine
 */
public class A140413 extends LinearRecurrence {

  /** Construct the sequence. */
  public A140413() {
    super(new long[] {1, 5, 3}, new long[] {1, 1, 9});
  }
}
