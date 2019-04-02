package irvine.oeis.a005;

import irvine.oeis.LinearRecurrence;

/**
 * A005673 F(n+1)-2^[ (n+1)/2 ] -2^[ n/2 ] +1.
 * @author Sean A. Irvine
 */
public class A005673 extends LinearRecurrence {

  /** Construct the sequence. */
  public A005673() {
    super(new long[] {2, 0, -5, 2, 2}, new long[] {0, 0, 0, 0, 1});
  }
}

