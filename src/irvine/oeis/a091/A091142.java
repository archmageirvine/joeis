package irvine.oeis.a091;

import irvine.oeis.LinearRecurrence;

/**
 * A091142 <code>a(n) = 2*a(n-1) + 4*a(n-2) - 2*a(n-3)</code> with initial terms <code>1, 2, 6</code>.
 * @author Sean A. Irvine
 */
public class A091142 extends LinearRecurrence {

  /** Construct the sequence. */
  public A091142() {
    super(new long[] {-2, 4, 2}, new long[] {1, 2, 6});
  }
}
