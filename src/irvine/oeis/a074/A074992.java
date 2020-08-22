package irvine.oeis.a074;

import irvine.oeis.LinearRecurrence;

/**
 * A074992 a(n) = (10^(2*n)+10^n+1)/3.
 * @author Sean A. Irvine
 */
public class A074992 extends LinearRecurrence {

  /** Construct the sequence. */
  public A074992() {
    super(new long[] {1000, -1110, 111}, new long[] {1, 37, 3367});
  }
}
