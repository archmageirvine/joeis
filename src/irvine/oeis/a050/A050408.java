package irvine.oeis.a050;

import irvine.oeis.LinearRecurrence;

/**
 * A050408 a(n) = 117*n^2/2 - 99*n/2 + 1.
 * @author Sean A. Irvine
 */
public class A050408 extends LinearRecurrence {

  /** Construct the sequence. */
  public A050408() {
    super(new long[] {1, -3, 3}, new long[] {1, 10, 136});
  }
}
