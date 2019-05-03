package irvine.oeis.a236;

import irvine.oeis.LinearRecurrence;

/**
 * A236549 The number of independent sets in <code>L(J_n)</code>, the line graph of the flower snark graph <code>J_n</code>.
 * @author Sean A. Irvine
 */
public class A236549 extends LinearRecurrence {

  /** Construct the sequence. */
  public A236549() {
    super(new long[] {-1, -20, 31, 128, -152, -68, 31, 8}, new long[] {8, 126, 1052, 11170, 112828, 1159416, 11869768, 121668290});
  }
}
