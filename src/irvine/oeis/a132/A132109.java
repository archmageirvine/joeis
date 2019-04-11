package irvine.oeis.a132;

import irvine.oeis.LinearRecurrence;

/**
 * A132109 <code>a(n) = (2^(n+1) + n^2 + n)/2</code>.
 * @author Sean A. Irvine
 */
public class A132109 extends LinearRecurrence {

  /** Construct the sequence. */
  public A132109() {
    super(new long[] {-2, 7, -9, 5}, new long[] {1, 3, 7, 14});
  }
}
