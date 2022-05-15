package irvine.oeis.a174;

import irvine.oeis.a056.A056940;

/**
 * A174109 Triangle read by rows: T(n, k) = c(n, q)/(c(k, q)*c(n-k, q)), where c(n, q) = Product_{j=1..n} (j+q)!/(j-1)! and q = 8.
 * @author Sean A. Irvine
 */
public class A174109 extends A056940 {

  /** Construct the sequence. */
  public A174109() {
    super(8);
  }
}

