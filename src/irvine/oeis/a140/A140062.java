package irvine.oeis.a140;

import irvine.oeis.LinearRecurrence;

/**
 * A140062 <code>101*2^(n-1) - 100</code>.
 * @author Sean A. Irvine
 */
public class A140062 extends LinearRecurrence {

  /** Construct the sequence. */
  public A140062() {
    super(new long[] {-2, 3}, new long[] {1, 102});
  }
}
