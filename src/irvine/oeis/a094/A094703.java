package irvine.oeis.a094;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A094703 a(n) = 8*a(n-1) + 21*a(n-2), with a(1)=1, a(2)=11.
 * @author Sean A. Irvine
 */
public class A094703 extends LinearRecurrence {

  /** Construct the sequence. */
  public A094703() {
    super(1, new long[] {21, 8}, new long[] {1, 11});
  }
}
