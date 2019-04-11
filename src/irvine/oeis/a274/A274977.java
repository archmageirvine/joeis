package irvine.oeis.a274;

import irvine.oeis.LinearRecurrence;

/**
 * A274977 <code>a(n) = a(n-1) + 3*a(n-2)</code> with <code>n&gt;1, a(0)=1, a(1)=6</code>.
 * @author Sean A. Irvine
 */
public class A274977 extends LinearRecurrence {

  /** Construct the sequence. */
  public A274977() {
    super(new long[] {3, 1}, new long[] {1, 6});
  }
}
