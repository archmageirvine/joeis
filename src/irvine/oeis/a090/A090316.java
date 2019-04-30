package irvine.oeis.a090;

import irvine.oeis.LinearRecurrence;

/**
 * A090316 <code>a(n) = 24a(n-1) + a(n-2)</code>, starting with <code>a(0) = 2</code> and <code>a(1) = 24</code>.
 * @author Sean A. Irvine
 */
public class A090316 extends LinearRecurrence {

  /** Construct the sequence. */
  public A090316() {
    super(new long[] {1, 24}, new long[] {2, 24});
  }
}
