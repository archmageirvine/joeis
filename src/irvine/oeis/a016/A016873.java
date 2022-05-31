package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016873 a(n) = 5*n + 2.
 * @author Sean A. Irvine
 */
public class A016873 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016873() {
    super(new long[] {-1, 2}, new long[] {2, 7});
  }
}
