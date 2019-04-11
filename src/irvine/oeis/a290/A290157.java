package irvine.oeis.a290;

import irvine.oeis.LinearRecurrence;

/**
 * A290157 Tribonacci-like sequence of composite numbers with <code>a(0) = 151646890045, a(1) = 836564809606</code> and <code>a(2) = 942785024683</code>.
 * @author Sean A. Irvine
 */
public class A290157 extends LinearRecurrence {

  /** Construct the sequence. */
  public A290157() {
    super(new long[] {1, 1, 1}, new long[] {151646890045L, 836564809606L, 942785024683L});
  }
}
