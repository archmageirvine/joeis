package irvine.oeis.a219;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A219190 Numbers of the form k*(5*k+1), where k = 0,-1,1,-2,2,-3,3,...
 * @author Sean A. Irvine
 */
public class A219190 extends LinearRecurrence {

  /** Construct the sequence. */
  public A219190() {
    super(1, new long[] {1, -1, -2, 2, 1}, new long[] {0, 4, 6, 18, 22});
  }
}
