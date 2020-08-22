package irvine.oeis.a024;

import irvine.oeis.LinearRecurrence;

/**
 * A024305 a(n) = 2*(n+1) + 3*n + ... + (k+1)*(n+2-k), where k = floor((n+1)/2).
 * @author Sean A. Irvine
 */
public class A024305 extends LinearRecurrence {

  /** Construct the sequence. */
  public A024305() {
    super(new long[] {-1, 1, 3, -3, -3, 3, 1}, new long[] {4, 6, 17, 22, 43, 52, 86});
  }
}

