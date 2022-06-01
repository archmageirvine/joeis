package irvine.oeis.a090;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A090390 Repeatedly multiply (1,0,0) by ([1,2,2],[2,1,2],[2,2,3]); sequence gives leading entry.
 * @author Sean A. Irvine
 */
public class A090390 extends LinearRecurrence {

  /** Construct the sequence. */
  public A090390() {
    super(new long[] {-1, 5, 5}, new long[] {1, 1, 9});
  }
}
