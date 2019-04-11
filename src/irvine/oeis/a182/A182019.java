package irvine.oeis.a182;

import irvine.oeis.LinearRecurrence;

/**
 * A182019 Number of independent sets of nodes in graph C_8 x P_n <code>(n&gt;=0)</code>.
 * @author Sean A. Irvine
 */
public class A182019 extends LinearRecurrence {

  /** Construct the sequence. */
  public A182019() {
    super(new long[] {1, 5, -109, 187, 334, -317, -65, 29}, new long[] {1, 47, 1155, 30277, 788453, 20546803, 535404487, 13951571713L});
  }
}
