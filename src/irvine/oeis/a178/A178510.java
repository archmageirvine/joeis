package irvine.oeis.a178;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A178510 a(n+1) = a(n)*100 + 21^n, with a(1)=1.
 * @author Sean A. Irvine
 */
public class A178510 extends LinearRecurrence {

  /** Construct the sequence. */
  public A178510() {
    super(1, new long[] {-2100, 121}, new long[] {1, 121});
  }
}
