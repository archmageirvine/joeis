package irvine.oeis.a176;

import irvine.oeis.LinearRecurrence;

/**
 * A176818 <code>a(n) = (3^(2*n+1) + 2^(n+2))/7</code>.
 * @author Sean A. Irvine
 */
public class A176818 extends LinearRecurrence {

  /** Construct the sequence. */
  public A176818() {
    super(new long[] {-18, 11}, new long[] {1, 5});
  }
}
