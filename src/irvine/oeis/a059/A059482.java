package irvine.oeis.a059;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A059482 a(0)=1, a(n) = a(n-1) + 8*10^(n-1).
 * @author Sean A. Irvine
 */
public class A059482 extends LinearRecurrence {

  /** Construct the sequence. */
  public A059482() {
    super(new long[] {-10, 11}, new long[] {1, 9});
  }
}
