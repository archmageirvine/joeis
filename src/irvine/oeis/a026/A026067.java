package irvine.oeis.a026;

import irvine.oeis.LinearRecurrence;

/**
 * A026067 a(n) = (d(n)-r(n))/2, where d = A026066 and r is the periodic sequence with fundamental period (1,0,0,0).
 * @author Sean A. Irvine
 */
public class A026067 extends LinearRecurrence {

  /** Construct the sequence. */
  public A026067() {
    super(new long[] {-1, 3, -3, 1, 1, -3, 3}, new long[] {52, 84, 123, 170, 225, 290, 364});
  }
}
