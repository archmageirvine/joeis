package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016813 <code>a(n) = 4*n + 1</code>.
 * @author Sean A. Irvine
 */
public class A016813 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016813() {
    super(new long[] {-1, 2}, new long[] {1, 5});
  }
}
