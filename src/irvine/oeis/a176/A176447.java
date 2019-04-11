package irvine.oeis.a176;

import irvine.oeis.LinearRecurrence;

/**
 * A176447 <code>a(2n) = -n, a(2n+1) = 2n+1</code>.
 * @author Sean A. Irvine
 */
public class A176447 extends LinearRecurrence {

  /** Construct the sequence. */
  public A176447() {
    super(new long[] {-1, 0, 2, 0}, new long[] {0, 1, -1, 3});
  }
}
