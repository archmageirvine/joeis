package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158463 <code>a(n) = 12*n^2 - 1</code>.
 * @author Sean A. Irvine
 */
public class A158463 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158463() {
    super(new long[] {1, -3, 3}, new long[] {-1, 11, 47});
  }
}
