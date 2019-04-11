package irvine.oeis.a168;

import irvine.oeis.LinearRecurrence;

/**
 * A168277 <code>a(n) = 2*n - (-1)^n - 2</code>.
 * @author Sean A. Irvine
 */
public class A168277 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168277() {
    super(new long[] {-1, 1, 1}, new long[] {1, 1, 5});
  }
}
