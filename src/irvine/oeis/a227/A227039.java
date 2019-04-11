package irvine.oeis.a227;

import irvine.oeis.LinearRecurrence;

/**
 * A227039 Positive solutions <code>x/(2^2*3*89)</code> of the Pell equation <code>x^2 -</code> 73*y^2 <code>= -1</code>.
 * @author Sean A. Irvine
 */
public class A227039 extends LinearRecurrence {

  /** Construct the sequence. */
  public A227039() {
    super(new long[] {-1, 4562498}, new long[] {1, 4562499});
  }
}
