package irvine.oeis.a027;

import irvine.oeis.LinearRecurrence;

/**
 * A027659 Binomial(n+2,2)+binomial(n+3,3)+binomial(n+4,4)+binomial(n+5,5).
 * @author Sean A. Irvine
 */
public class A027659 extends LinearRecurrence {

  /** Construct the sequence. */
  public A027659() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {4, 18, 52, 121, 246, 455});
  }
}
