package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016789 <code>a(n) = 3*n + 2</code>.
 * @author Sean A. Irvine
 */
public class A016789 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016789() {
    super(new long[] {-1, 2}, new long[] {2, 5});
  }
}
