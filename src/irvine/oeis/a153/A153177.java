package irvine.oeis.a153;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A153177 a(n) = L(9*n)/L(n) where L(n) = Lucas number A000204(n).
 * @author Sean A. Irvine
 */
public class A153177 extends LinearRecurrence {

  /** Construct the sequence. */
  public A153177() {
    super(1, new long[] {1, -34, -714, 4641, 12376, -12376, -4641, 714, 34}, new long[] {76, 1926, 109801, 4769326, 230701876, 10716675201L, 505618944676L, 23714405408926L, 1114769987764201L});
  }
}
