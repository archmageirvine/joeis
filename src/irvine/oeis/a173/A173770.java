package irvine.oeis.a173;

import irvine.oeis.LinearRecurrence;

/**
 * A173770 <code>a(n)=(4*10^n-13)/9</code>.
 * @author Sean A. Irvine
 */
public class A173770 extends LinearRecurrence {

  /** Construct the sequence. */
  public A173770() {
    super(new long[] {-10, 11}, new long[] {3, 43});
  }
}
