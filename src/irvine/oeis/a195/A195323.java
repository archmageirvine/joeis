package irvine.oeis.a195;

import irvine.oeis.LinearRecurrence;

/**
 * A195323 <code>a(n) = 22*n^2</code>.
 * @author Sean A. Irvine
 */
public class A195323 extends LinearRecurrence {

  /** Construct the sequence. */
  public A195323() {
    super(new long[] {1, -3, 3}, new long[] {0, 22, 88});
  }
}
