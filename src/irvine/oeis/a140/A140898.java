package irvine.oeis.a140;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A140898 Expansion of -x^2/(136*x^2+2*x-1).
 * @author Sean A. Irvine
 */
public class A140898 extends LinearRecurrence {

  /** Construct the sequence. */
  public A140898() {
    super(new long[] {136, 2}, new long[] {0, 1});
  }
}
