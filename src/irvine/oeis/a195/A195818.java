package irvine.oeis.a195;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A195818 Generalized 14-gonal numbers: m*(6*m-5), m = 0,+1,-1,+2,-2,+3,-3,...
 * @author Sean A. Irvine
 */
public class A195818 extends LinearRecurrence {

  /** Construct the sequence. */
  public A195818() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {0, 1, 11, 14, 34});
  }
}
