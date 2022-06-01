package irvine.oeis.a200;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A200069 a(n) = 4*a(n-1) + 13*a(n-2) for n&gt;2, a(1)=1, a(2)=4.
 * @author Sean A. Irvine
 */
public class A200069 extends LinearRecurrence {

  /** Construct the sequence. */
  public A200069() {
    super(new long[] {13, 4}, new long[] {1, 4});
  }
}
