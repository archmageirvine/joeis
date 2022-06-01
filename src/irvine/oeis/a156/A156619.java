package irvine.oeis.a156;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A156619 Numbers congruent to {7, 18} mod 25.
 * @author Sean A. Irvine
 */
public class A156619 extends LinearRecurrence {

  /** Construct the sequence. */
  public A156619() {
    super(new long[] {-1, 1, 1}, new long[] {7, 18, 32});
  }
}
