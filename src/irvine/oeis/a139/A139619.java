package irvine.oeis.a139;

import irvine.oeis.LinearRecurrence;

/**
 * A139619 <code>a(n) = 171*n + 19</code>.
 * @author Sean A. Irvine
 */
public class A139619 extends LinearRecurrence {

  /** Construct the sequence. */
  public A139619() {
    super(new long[] {-1, 2}, new long[] {19, 190});
  }
}
