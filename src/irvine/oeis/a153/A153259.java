package irvine.oeis.a153;

import irvine.oeis.LinearRecurrence;

/**
 * A153259 a(n)=n^3-(3*(n+3))^2.
 * @author Sean A. Irvine
 */
public class A153259 extends LinearRecurrence {

  /** Construct the sequence. */
  public A153259() {
    super(new long[] {-1, 4, -6, 4}, new long[] {-81, -143, -217, -297});
  }
}
