package irvine.oeis.a167;

import irvine.oeis.LinearRecurrence;

/**
 * A167780 Subsequence of A167708 whose indices are <code>0 mod 5</code>, that is, <code>a(n) =</code> A167708(5n+5).
 * @author Sean A. Irvine
 */
public class A167780 extends LinearRecurrence {

  /** Construct the sequence. */
  public A167780() {
    super(new long[] {-1, 340}, new long[] {959, 326050});
  }
}
