package irvine.oeis.a140;

import irvine.oeis.LinearRecurrence;

/**
 * A140498 a(n) = 3*a(n-1)-3*a(n-2)+3*a(n-3) with a(0)=1, a(1)=3, a(2)=7.
 * @author Sean A. Irvine
 */
public class A140498 extends LinearRecurrence {

  /** Construct the sequence. */
  public A140498() {
    super(new long[] {3, -3, 3}, new long[] {1, 3, 7});
  }
}
