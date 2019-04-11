package irvine.oeis.a202;

import irvine.oeis.LinearRecurrence;

/**
 * A202155 x-values in the solution to <code> x^2 -</code> 13*y^2 <code>= -1</code>.
 * @author Sean A. Irvine
 */
public class A202155 extends LinearRecurrence {

  /** Construct the sequence. */
  public A202155() {
    super(new long[] {-1, 1298}, new long[] {18, 23382});
  }
}
