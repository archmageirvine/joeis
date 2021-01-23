package irvine.oeis.a089;

import irvine.oeis.LinearRecurrence;

/**
 * A089507 Second column of triangle A089504 and second column of array A078741 divided by 18.
 * @author Sean A. Irvine
 */
public class A089507 extends LinearRecurrence {

  /** Construct the sequence. */
  public A089507() {
    super(new long[] {-144, 30}, new long[] {1, 30});
  }
}
