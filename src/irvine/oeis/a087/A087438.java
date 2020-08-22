package irvine.oeis.a087;

import irvine.oeis.LinearRecurrence;

/**
 * A087438 a(n) = 3*2^(2*(n-1)) + 2^(n-2)*(n+1).
 * @author Sean A. Irvine
 */
public class A087438 extends LinearRecurrence {

  /** Construct the sequence. */
  public A087438() {
    super(new long[] {16, -20, 8}, new long[] {1, 4, 15});
  }
}
