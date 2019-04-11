package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016993 <code>a(n) = 7*n+1</code>.
 * @author Sean A. Irvine
 */
public class A016993 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016993() {
    super(new long[] {-1, 2}, new long[] {1, 8});
  }
}
