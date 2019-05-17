package irvine.oeis.a053;

import irvine.oeis.LinearRecurrence;

/**
 * A053524 <code>a(n) = (6^n - (-2)^n)/8</code>.
 * @author Sean A. Irvine
 */
public class A053524 extends LinearRecurrence {

  /** Construct the sequence. */
  public A053524() {
    super(new long[] {12, 4}, new long[] {0, 1});
  }
}
