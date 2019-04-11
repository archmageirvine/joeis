package irvine.oeis.a227;

import irvine.oeis.LinearRecurrence;

/**
 * A227275 Positive solutions of the Pell equation <code>x^2 -</code> 97*y^2 <code>= -1</code>. Solutions y <code>= 569*a(n)</code>.
 * @author Sean A. Irvine
 */
public class A227275 extends LinearRecurrence {

  /** Construct the sequence. */
  public A227275() {
    super(new long[] {-1, 125619266}, new long[] {1, 125619265});
  }
}
