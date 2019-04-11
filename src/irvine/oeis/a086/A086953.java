package irvine.oeis.a086;

import irvine.oeis.LinearRecurrence;

/**
 * A086953 Binomial transform of <code>(-1)^mod(n,3)</code> (A257075).
 * @author Sean A. Irvine
 */
public class A086953 extends LinearRecurrence {

  /** Construct the sequence. */
  public A086953() {
    super(new long[] {2, -3, 3}, new long[] {1, 0, 0});
  }
}
