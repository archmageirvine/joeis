package irvine.oeis.a233;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A233326 a(n) = (7^(n+1) - 4) / 3.
 * @author Sean A. Irvine
 */
public class A233326 extends LinearRecurrence {

  /** Construct the sequence. */
  public A233326() {
    super(new long[] {-7, 8}, new long[] {1, 15});
  }
}
