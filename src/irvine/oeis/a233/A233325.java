package irvine.oeis.a233;

import irvine.oeis.LinearRecurrence;

/**
 * A233325 <code>(2*6^(n+1) - 7) / 5</code>.
 * @author Sean A. Irvine
 */
public class A233325 extends LinearRecurrence {

  /** Construct the sequence. */
  public A233325() {
    super(new long[] {-6, 7}, new long[] {1, 13});
  }
}
