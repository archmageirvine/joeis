package irvine.oeis.a084;

import irvine.oeis.LinearRecurrence;

/**
 * A084879 Number of <code>(k</code>,m,n)-multiantichains of multisets with <code>k=3</code> and m=2.
 * @author Sean A. Irvine
 */
public class A084879 extends LinearRecurrence {

  /** Construct the sequence. */
  public A084879() {
    super(new long[] {162, -99, 18}, new long[] {1, 3, 18});
  }
}
