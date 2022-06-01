package irvine.oeis.a084;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A084328 a(0)=0, a(1)=1; a(n) = 13*a(n-1) - 11*a(n-2).
 * @author Sean A. Irvine
 */
public class A084328 extends LinearRecurrence {

  /** Construct the sequence. */
  public A084328() {
    super(new long[] {-11, 13}, new long[] {0, 1});
  }
}
