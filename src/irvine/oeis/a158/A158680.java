package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158680 <code>a(n) = 62*n^2 - 1</code>.
 * @author Sean A. Irvine
 */
public class A158680 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158680() {
    super(new long[] {1, -3, 3}, new long[] {61, 247, 557});
  }
}
