package irvine.oeis.a014;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A014918 a(1)=1, a(n) = n*6^(n-1) + a(n-1).
 * @author Sean A. Irvine
 */
public class A014918 extends LinearRecurrence {

  /** Construct the sequence. */
  public A014918() {
    super(new long[] {36, -48, 13}, new long[] {1, 13, 121});
  }
}
