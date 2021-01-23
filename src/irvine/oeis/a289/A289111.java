package irvine.oeis.a289;

import irvine.oeis.LinearRecurrence;

/**
 * A289111 a(n) = (2^49 - 2)*n/3 + 444813635231.
 * @author Sean A. Irvine
 */
public class A289111 extends LinearRecurrence {

  /** Construct the sequence. */
  public A289111() {
    super(new long[] {-1, 2}, new long[] {444813635231L, 188094798109001L});
  }
}
