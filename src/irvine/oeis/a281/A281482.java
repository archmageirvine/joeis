package irvine.oeis.a281;

import irvine.oeis.LinearRecurrence;

/**
 * A281482 <code>a(n) = 2^(n + 1) * (2^n + 1) - 1</code>.
 * @author Sean A. Irvine
 */
public class A281482 extends LinearRecurrence {

  /** Construct the sequence. */
  public A281482() {
    super(new long[] {8, -14, 7}, new long[] {3, 11, 39});
  }
}
