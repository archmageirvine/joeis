package irvine.oeis.a227;

import irvine.oeis.LinearRecurrence;

/**
 * A227040 Positive solutions y/5^3 of the Pell equation <code>x^2 -</code> 73*y^2 <code>= -1</code>.
 * @author Sean A. Irvine
 */
public class A227040 extends LinearRecurrence {

  /** Construct the sequence. */
  public A227040() {
    super(new long[] {-1, 4562498}, new long[] {1, 4562497});
  }
}
