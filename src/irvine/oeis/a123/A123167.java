package irvine.oeis.a123;

import irvine.oeis.LinearRecurrence;

/**
 * A123167 Continued fraction for c=sqrt(2)*(exp(sqrt(2))+1)/(exp(sqrt(2))-1). <code>a(2*n-1) = 8*n-6, a(2*n) = 4*n-1</code>.
 * @author Sean A. Irvine
 */
public class A123167 extends LinearRecurrence {

  /** Construct the sequence. */
  public A123167() {
    super(new long[] {-1, 0, 2, 0}, new long[] {2, 3, 10, 7});
  }
}
