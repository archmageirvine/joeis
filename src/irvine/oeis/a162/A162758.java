package irvine.oeis.a162;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A162758 a(n) = 14*a(n-1)-46*a(n-2) for n &gt; 1; a(0) = 1, a(1) = 8.
 * @author Sean A. Irvine
 */
public class A162758 extends LinearRecurrence {

  /** Construct the sequence. */
  public A162758() {
    super(new long[] {-46, 14}, new long[] {1, 8});
  }
}
