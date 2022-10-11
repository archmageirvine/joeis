package irvine.oeis.a060;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A060337 Number of labeled acyclic digraphs with n nodes containing exactly n-2 points of in-degree zero.
 * @author Georg Fischer
 */
public class A060337 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A060337() {
    super(3, "[0,512,-2688,6048,-7640,5964,-2982,955,-189,21,-1", "15,198,1610,10575,61845,336924,1751076,8801325,43141175", 0);
  }
}
