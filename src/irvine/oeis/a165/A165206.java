package irvine.oeis.a165;

import irvine.oeis.LinearRecurrence;

/**
 * A165206 <code>a(n)=-((4n-3)*F(2n-2)+(7n-4)*F(2n-1))</code>.
 * @author Sean A. Irvine
 */
public class A165206 extends LinearRecurrence {

  /** Construct the sequence. */
  public A165206() {
    super(new long[] {-1, 6, -11, 6}, new long[] {1, -3, -25, -112});
  }
}
