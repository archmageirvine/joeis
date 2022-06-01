package irvine.oeis.a155;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A155466 a(n) = 7*a(n-1) - 7*a(n-2) + a(n-3) for n &gt; 2; a(0) = 28, a(1) = 207, a(2) = 1248.
 * @author Sean A. Irvine
 */
public class A155466 extends LinearRecurrence {

  /** Construct the sequence. */
  public A155466() {
    super(new long[] {1, -7, 7}, new long[] {28, 207, 1248});
  }
}
