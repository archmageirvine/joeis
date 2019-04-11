package irvine.oeis.a121;

import irvine.oeis.LinearRecurrence;

/**
 * A121720 <code>a(n)= 4*a(n-2) -2*a(n-4)</code>.
 * @author Sean A. Irvine
 */
public class A121720 extends LinearRecurrence {

  /** Construct the sequence. */
  public A121720() {
    super(new long[] {-2, 0, 4, 0}, new long[] {0, 1, 1, 3});
  }
}
