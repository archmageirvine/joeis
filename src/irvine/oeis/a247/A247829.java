package irvine.oeis.a247;

import irvine.oeis.LinearRecurrence;

/**
 * A247829 a(3*k) = k*(k+1), a(3*k+1) = (2*k-1)*(2*k+1), a(3*k+2) = (2*k-1)*(2*k+3).
 * @author Sean A. Irvine
 */
public class A247829 extends LinearRecurrence {

  /** Construct the sequence. */
  public A247829() {
    super(new long[] {1, 0, 0, -3, 0, 0, 3, 0, 0}, new long[] {0, -1, -3, 2, 3, 5, 6, 15, 21});
  }
}
