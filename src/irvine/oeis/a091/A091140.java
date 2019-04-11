package irvine.oeis.a091;

import irvine.oeis.LinearRecurrence;

/**
 * A091140 <code>a(n) = 2*a(n-1) + 4*a(n-2) - 2*a(n-3)</code> with initial terms <code>1, 3, 9</code>.
 * @author Sean A. Irvine
 */
public class A091140 extends LinearRecurrence {

  /** Construct the sequence. */
  public A091140() {
    super(new long[] {-2, 4, 2}, new long[] {1, 3, 9});
  }
}
