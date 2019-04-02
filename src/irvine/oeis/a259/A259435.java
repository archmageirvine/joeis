package irvine.oeis.a259;

import irvine.oeis.LinearRecurrence;

/**
 * A259435 a(n) = 2*(n-1)^6*(n+1)^2*(n^2+10*n+1).
 * @author Sean A. Irvine
 */
public class A259435 extends LinearRecurrence {

  /** Construct the sequence. */
  public A259435() {
    super(new long[] {1, -11, 55, -165, 330, -462, 462, -330, 165, -55, 11}, new long[] {2, 0, 450, 81920, 2077650, 22413312, 148531250, 716636160, 2763575010L, 9017753600L, 25850353122L});
  }
}
