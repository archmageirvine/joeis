package irvine.oeis.a060;

import irvine.oeis.LinearRecurrence;

/**
 * A060785 <code>a(n) = 3*(n-2)*(5*n -11)</code>.
 * @author Sean A. Irvine
 */
public class A060785 extends LinearRecurrence {

  /** Construct the sequence. */
  public A060785() {
    super(new long[] {1, -3, 3}, new long[] {0, 12, 54});
  }
}
