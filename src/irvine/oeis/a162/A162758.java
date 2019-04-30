package irvine.oeis.a162;

import irvine.oeis.LinearRecurrence;

/**
 * A162758 <code>a(n) = 14*a(n-1)-46*a(n-2)</code> for <code>n &gt; 1; a(0) = 1, a(1) = 8</code>.
 * @author Sean A. Irvine
 */
public class A162758 extends LinearRecurrence {

  /** Construct the sequence. */
  public A162758() {
    super(new long[] {-46, 14}, new long[] {1, 8});
  }
}
