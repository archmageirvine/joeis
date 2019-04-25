package irvine.oeis.a090;

import irvine.oeis.LinearRecurrence;

/**
 * A090390 Repeatedly multiply <code>(1,0,0) by ([1,2,2],[2,1,2],[2,2,3])</code>; sequence gives leading entry.
 * @author Sean A. Irvine
 */
public class A090390 extends LinearRecurrence {

  /** Construct the sequence. */
  public A090390() {
    super(new long[] {-1, 5, 5}, new long[] {1, 1, 9});
  }
}
