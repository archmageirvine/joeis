package irvine.oeis.a080;

import irvine.oeis.LinearRecurrence;

/**
 * A080880 <code>a(n)*a(n+3) - a(n+1)*a(n+2) = 2^n</code>, given <code>a(0)=1, a(1)=2, a(2)=2</code>.
 * @author Sean A. Irvine
 */
public class A080880 extends LinearRecurrence {

  /** Construct the sequence. */
  public A080880() {
    super(new long[] {-4, 0, 5, 0}, new long[] {1, 2, 2, 5});
  }
}
