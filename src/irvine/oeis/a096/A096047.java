package irvine.oeis.a096;

import irvine.oeis.LinearRecurrence;

/**
 * A096047 <code>a(n)=B(2n,4)/B(2n)</code> (see comment).
 * @author Sean A. Irvine
 */
public class A096047 extends LinearRecurrence {

  /** Construct the sequence. */
  public A096047() {
    super(new long[] {64, -84, 21}, new long[] {1, 22, 346});
  }
}
