package irvine.oeis.a219;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A219191 Numbers of the form k*(7*k+1), where k = 0,-1,1,-2,2,-3,3,...
 * @author Sean A. Irvine
 */
public class A219191 extends LinearRecurrence {

  /** Construct the sequence. */
  public A219191() {
    super(1, new long[] {1, -1, -2, 2, 1}, new long[] {0, 6, 8, 26, 30});
  }
}
