package irvine.oeis.a162;

import irvine.oeis.LinearRecurrence;

/**
 * A162963 <code>a(n) = 5*a(n-2)</code> for <code>n &gt; 2; a(1) = 2, a(2) = 5</code>.
 * @author Sean A. Irvine
 */
public class A162963 extends LinearRecurrence {

  /** Construct the sequence. */
  public A162963() {
    super(new long[] {5, 0}, new long[] {2, 5});
  }
}
