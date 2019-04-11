package irvine.oeis.a130;

import irvine.oeis.LinearRecurrence;

/**
 * A130883 <code>a(n) = 2*n^2 - n + 1</code>.
 * @author Sean A. Irvine
 */
public class A130883 extends LinearRecurrence {

  /** Construct the sequence. */
  public A130883() {
    super(new long[] {1, -3, 3}, new long[] {1, 2, 7});
  }
}
