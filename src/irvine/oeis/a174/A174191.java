package irvine.oeis.a174;

import irvine.oeis.LinearRecurrence;

/**
 * A174191 Expansion of <code>(1+x)*(2*x-1)/((1-x)*(x^2+2*x-1))</code>.
 * @author Sean A. Irvine
 */
public class A174191 extends LinearRecurrence {

  /** Construct the sequence. */
  public A174191() {
    super(new long[] {-1, -1, 3}, new long[] {1, 2, 3});
  }
}
