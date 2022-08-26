package irvine.oeis.a140;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A140716 Blocky integers, i.e., integers m &gt; 1 such that there is a run of m consecutive integer squares the average of which is a square.
 * @author Sean A. Irvine
 */
public class A140716 extends LinearRecurrence {

  /** Construct the sequence. */
  public A140716() {
    super(new long[] {-1, 1, 1}, new long[] {7, 25, 31});
  }
}
