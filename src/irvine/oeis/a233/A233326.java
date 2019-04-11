package irvine.oeis.a233;

import irvine.oeis.LinearRecurrence;

/**
 * A233326 <code>(7^(n+1) - 4) / 3</code>.
 * @author Sean A. Irvine
 */
public class A233326 extends LinearRecurrence {

  /** Construct the sequence. */
  public A233326() {
    super(new long[] {-7, 8}, new long[] {1, 15});
  }
}
