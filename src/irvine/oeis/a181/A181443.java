package irvine.oeis.a181;

import irvine.oeis.LinearRecurrence;

/**
 * A181443 Solutions <code>a(n)</code> to (r(n)-5)*(r(n)-6) <code>= 21 *a(n)*(a(n)-1)</code>.
 * @author Sean A. Irvine
 */
public class A181443 extends LinearRecurrence {

  /** Construct the sequence. */
  public A181443() {
    super(new long[] {1, -1, 0, 0, -110, 110, 0, 0, 1}, new long[] {1, 2, 5, 22, 34, 161, 494, 2365, 3685});
  }
}
