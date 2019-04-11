package irvine.oeis.a242;

import irvine.oeis.LinearRecurrence;

/**
 * A242658 <code>a(n) = 3n^2-3n+2</code>.
 * @author Sean A. Irvine
 */
public class A242658 extends LinearRecurrence {

  /** Construct the sequence. */
  public A242658() {
    super(new long[] {1, -3, 3}, new long[] {2, 2, 8});
  }
}
