package irvine.oeis.a093;

import irvine.oeis.LinearRecurrence;

/**
 * A093103 <code>a(1)=1, a(2)=8, a(n+2) = 8*a(n+1) + 21*a(n)</code>.
 * @author Sean A. Irvine
 */
public class A093103 extends LinearRecurrence {

  /** Construct the sequence. */
  public A093103() {
    super(new long[] {21, 8}, new long[] {1, 8});
  }
}
