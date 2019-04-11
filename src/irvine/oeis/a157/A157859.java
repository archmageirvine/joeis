package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157859 <code>a(n) = 103680000*n^2 - 28800*n + 1</code>.
 * @author Sean A. Irvine
 */
public class A157859 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157859() {
    super(new long[] {1, -3, 3}, new long[] {103651201, 414662401, 933033601});
  }
}
