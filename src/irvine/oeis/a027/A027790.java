package irvine.oeis.a027;

import irvine.oeis.LinearRecurrence;

/**
 * A027790 <code>a(n) = 10*(n+1)*binomial(n+3,5)/3</code>.
 * @author Sean A. Irvine
 */
public class A027790 extends LinearRecurrence {

  /** Construct the sequence. */
  public A027790() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {10, 80, 350, 1120, 2940, 6720, 13860});
  }
}
