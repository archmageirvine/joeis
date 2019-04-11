package irvine.oeis.a084;

import irvine.oeis.LinearRecurrence;

/**
 * A084247 <code>a(n) = -a(n-1) + 2a(n-2), a(0)=1, a(1)=2</code>.
 * @author Sean A. Irvine
 */
public class A084247 extends LinearRecurrence {

  /** Construct the sequence. */
  public A084247() {
    super(new long[] {2, -1}, new long[] {1, 2});
  }
}
