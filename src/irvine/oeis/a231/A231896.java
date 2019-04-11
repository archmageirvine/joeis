package irvine.oeis.a231;

import irvine.oeis.LinearRecurrence;

/**
 * A231896 <code>a(n) = 4*a(n-1) - a(n-2)</code> with <code>a(0) = 0, a(1) = 4</code>.
 * @author Sean A. Irvine
 */
public class A231896 extends LinearRecurrence {

  /** Construct the sequence. */
  public A231896() {
    super(new long[] {-1, 4}, new long[] {0, 4});
  }
}
