package irvine.oeis.a155;

import irvine.oeis.LinearRecurrence;

/**
 * A155466 <code>a(n) = 7*a(n-1) - 7*a(n-2) + a(n-3)</code> for <code>n &gt; 2</code>; <code>a(0) = 28, a(1) = 207, a(2) = 1248</code>.
 * @author Sean A. Irvine
 */
public class A155466 extends LinearRecurrence {

  /** Construct the sequence. */
  public A155466() {
    super(new long[] {1, -7, 7}, new long[] {28, 207, 1248});
  }
}
