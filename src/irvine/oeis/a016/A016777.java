package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016777 <code>a(n) = 3*n + 1</code>.
 * @author Sean A. Irvine
 */
public class A016777 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016777() {
    super(new long[] {-1, 2}, new long[] {1, 4});
  }
}
