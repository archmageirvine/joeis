package irvine.oeis.a022;

import irvine.oeis.LinearRecurrence;

/**
 * A022412 Expansion of <code>1/((1-x)(1-5x)(1-6x)(1-11x))</code>.
 * @author Sean A. Irvine
 */
public class A022412 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022412() {
    super(new long[] {-330, 481, -173, 23}, new long[] {1, 23, 356, 4690});
  }
}
