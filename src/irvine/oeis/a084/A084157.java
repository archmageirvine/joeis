package irvine.oeis.a084;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A084157 a(n) = 8*a(n-1) - 16*a(n-2) + 12*a(n-4) with a(0)=0, a(1)=1, a(2)=4, a(3)=22.
 * @author Sean A. Irvine
 */
public class A084157 extends LinearRecurrence {

  /** Construct the sequence. */
  public A084157() {
    super(new long[] {12, 0, -16, 8}, new long[] {0, 1, 4, 22});
  }
}
