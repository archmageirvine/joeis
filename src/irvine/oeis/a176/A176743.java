package irvine.oeis.a176;

import irvine.oeis.LinearRecurrence;

/**
 * A176743 <code>a(n) =</code> GCD( A000217(n+1), A002378(n+2)).
 * @author Sean A. Irvine
 */
public class A176743 extends LinearRecurrence {

  /** Construct the sequence. */
  public A176743() {
    super(new long[] {-1, 0, 0, 0, 2, 0, 0, 0}, new long[] {1, 3, 2, 10, 3, 7, 4, 18});
  }
}
