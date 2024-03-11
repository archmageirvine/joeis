package irvine.oeis.a060;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A060405 Sum of n-th Lucas number (A000032(n)) and n-th Pell number (A000129(n)).
 * @author Sean A. Irvine
 */
public class A060405 extends LinearRecurrence {

  /** Construct the sequence. */
  public A060405() {
    super(new long[] {-1, -3, 0, 3}, new long[] {2, 2, 5, 9});
  }
}
