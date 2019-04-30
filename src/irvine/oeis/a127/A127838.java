package irvine.oeis.a127;

import irvine.oeis.LinearRecurrence;

/**
 * A127838 <code>a(1) = 1, a(2) = a(3) = a(4) = 0; a(n) = a(n-4) + a(n-3)</code> for <code>n &gt; 4</code>.
 * @author Sean A. Irvine
 */
public class A127838 extends LinearRecurrence {

  /** Construct the sequence. */
  public A127838() {
    super(new long[] {1, 1, 0, 0}, new long[] {1, 0, 0, 0});
  }
}
