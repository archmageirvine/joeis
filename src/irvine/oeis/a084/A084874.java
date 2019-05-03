package irvine.oeis.a084;

import irvine.oeis.LinearRecurrence;

/**
 * A084874 Number of <code>(k,m,n)-antichains</code> of multisets with <code>k=3</code> and <code>m=2</code>.
 * @author Sean A. Irvine
 */
public class A084874 extends LinearRecurrence {

  /** Construct the sequence. */
  public A084874() {
    super(new long[] {162, -99, 18}, new long[] {0, 0, 9});
  }
}
