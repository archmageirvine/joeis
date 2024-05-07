package irvine.oeis.a069;

import irvine.oeis.a000.A000027;

/**
 * A069571 Numbers n in which the k-th digit (counted from the right) is nonzero and is either a divisor of k (but not 1 in case k has a single-digit prime divisor) or a multiple of k, for all 1 &lt;= k &lt;= number of digits of n.
 * @author Sean A. Irvine
 */
public class A069571 extends A069556 {

  /** Construct the sequence. */
  public A069571() {
    super(new A000027());
  }
}
