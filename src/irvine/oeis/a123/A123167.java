package irvine.oeis.a123;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A123167 Continued fraction for c=sqrt(2)*(exp(sqrt(2))+1)/(exp(sqrt(2))-1). a(2*n-1) = 8*n-6, a(2*n) = 4*n-1.
 * @author Sean A. Irvine
 */
public class A123167 extends LinearRecurrence {

  /** Construct the sequence. */
  public A123167() {
    super(1, new long[] {-1, 0, 2, 0}, new long[] {2, 3, 10, 7});
  }
}
