package irvine.oeis.a241;

import irvine.oeis.LinearRecurrence;

/**
 * A241851 <code>a(n) = n^2 + 21</code>.
 * @author Sean A. Irvine
 */
public class A241851 extends LinearRecurrence {

  /** Construct the sequence. */
  public A241851() {
    super(new long[] {1, -3, 3}, new long[] {21, 22, 25});
  }
}
