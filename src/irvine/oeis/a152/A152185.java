package irvine.oeis.a152;

import irvine.oeis.LinearRecurrence;

/**
 * A152185 <code>a(n) = -3*a(n-1) + 5*a(n-2), n &gt; 1; a(0)=1, a(1)=-5</code>.
 * @author Sean A. Irvine
 */
public class A152185 extends LinearRecurrence {

  /** Construct the sequence. */
  public A152185() {
    super(new long[] {5, -3}, new long[] {1, -5});
  }
}
