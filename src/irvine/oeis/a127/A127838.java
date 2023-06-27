package irvine.oeis.a127;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A127838 a(1) = 1, a(2) = a(3) = a(4) = 0; a(n) = a(n-4) + a(n-3) for n &gt; 4.
 * @author Sean A. Irvine
 */
public class A127838 extends LinearRecurrence {

  /** Construct the sequence. */
  public A127838() {
    super(1, new long[] {1, 1, 0, 0}, new long[] {1, 0, 0, 0});
  }
}
