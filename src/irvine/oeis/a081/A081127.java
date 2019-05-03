package irvine.oeis.a081;

import irvine.oeis.LinearRecurrence;

/**
 * A081127 <code>11th</code> binomial transform of <code>(0,1,0,0,0,0,0,......)</code>.
 * @author Sean A. Irvine
 */
public class A081127 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081127() {
    super(new long[] {-121, 22}, new long[] {0, 1});
  }
}
