package irvine.oeis.a140;

import irvine.oeis.LinearRecurrence;

/**
 * A140184 <code>a(n) = 2*a(n-1) + 16*a(n-2) + 16*a(n-3)</code>.
 * @author Sean A. Irvine
 */
public class A140184 extends LinearRecurrence {

  /** Construct the sequence. */
  public A140184() {
    super(new long[] {16, 16, 2}, new long[] {1, 14, 60});
  }
}
