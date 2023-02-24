package irvine.oeis.a093;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A093103 a(n+2) = 8*a(n+1) + 21*a(n), with a(1)=1, a(2)=8.
 * @author Sean A. Irvine
 */
public class A093103 extends LinearRecurrence {

  /** Construct the sequence. */
  public A093103() {
    super(new long[] {21, 8}, new long[] {1, 8});
  }
}
