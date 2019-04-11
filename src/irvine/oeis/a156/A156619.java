package irvine.oeis.a156;

import irvine.oeis.LinearRecurrence;

/**
 * A156619 Numbers congruent to <code>{7, 18} mod 25</code>.
 * @author Sean A. Irvine
 */
public class A156619 extends LinearRecurrence {

  /** Construct the sequence. */
  public A156619() {
    super(new long[] {-1, 1, 1}, new long[] {7, 18, 32});
  }
}
