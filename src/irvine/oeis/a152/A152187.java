package irvine.oeis.a152;

import irvine.oeis.LinearRecurrence;

/**
 * A152187 <code>a(n) = 3*a(n-1) + 5*a(n-2)</code>, with <code>a(0)=1, a(1)=5</code>.
 * @author Sean A. Irvine
 */
public class A152187 extends LinearRecurrence {

  /** Construct the sequence. */
  public A152187() {
    super(new long[] {5, 3}, new long[] {1, 5});
  }
}
