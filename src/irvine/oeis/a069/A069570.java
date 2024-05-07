package irvine.oeis.a069;

import irvine.oeis.a000.A000027;

/**
 * A069570 Numbers n in which the k-th digit (counted from the right) is nonzero and either a divisor or a multiple of k, for all 1 &lt;= k &lt;= number of digits of n.
 * @author Sean A. Irvine
 */
public class A069570 extends A069559 {

  /** Construct the sequence. */
  public A069570() {
    super(new A000027());
  }
}
