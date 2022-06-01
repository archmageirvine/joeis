package irvine.oeis.a140;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A140295 a(n)=a(n-1)+a(n-2)+2a(n-3).
 * @author Sean A. Irvine
 */
public class A140295 extends LinearRecurrence {

  /** Construct the sequence. */
  public A140295() {
    super(new long[] {2, 1, 1}, new long[] {1, -2, 4});
  }
}
