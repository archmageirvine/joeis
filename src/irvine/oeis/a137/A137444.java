package irvine.oeis.a137;

import irvine.oeis.LinearRecurrence;

/**
 * A137444 <code>a(n) = 2*a(n-1) - 2*a(n-2)</code> with <code>a(0)=1, a(1)=4</code>.
 * @author Sean A. Irvine
 */
public class A137444 extends LinearRecurrence {

  /** Construct the sequence. */
  public A137444() {
    super(new long[] {-2, 2}, new long[] {1, 4});
  }
}
