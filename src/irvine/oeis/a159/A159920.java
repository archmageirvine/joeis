package irvine.oeis.a159;

import irvine.oeis.LinearRecurrence;

/**
 * A159920 Sums of the antidiagonals of Sundaram's sieve <code>(A159919)</code>.
 * @author Sean A. Irvine
 */
public class A159920 extends LinearRecurrence {

  /** Construct the sequence. */
  public A159920() {
    super(new long[] {-1, 4, -6, 4}, new long[] {4, 14, 32, 60});
  }
}
