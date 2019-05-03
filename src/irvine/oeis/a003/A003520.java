package irvine.oeis.a003;

import irvine.oeis.LinearRecurrence;

/**
 * A003520 <code>a(n) = a(n-1) + a(n-5); a(0) =</code> ... <code>= a(4) = 1</code>.
 * @author Sean A. Irvine
 */
public class A003520 extends LinearRecurrence {

  /** Construct the sequence. */
  public A003520() {
    super(new long[] {1, 0, 0, 0, 1}, new long[] {1, 1, 1, 1, 1});
  }
}
