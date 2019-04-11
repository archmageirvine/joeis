package irvine.oeis.a125;

import irvine.oeis.LinearRecurrence;

/**
 * A125586 <code>2^(2n-1) - (n+2)*3^(n-2)</code>.
 * @author Sean A. Irvine
 */
public class A125586 extends LinearRecurrence {

  /** Construct the sequence. */
  public A125586() {
    super(new long[] {36, -33, 10}, new long[] {1, 4, 17});
  }
}
