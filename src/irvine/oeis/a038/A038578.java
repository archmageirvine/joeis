package irvine.oeis.a038;

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A038578 Number of self-avoiding closed walks from 0 of area n in strip Z X {-1,0,1}.
 * @author Sean A. Irvine
 */
public class A038578 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A038578() {
    super(0, new long[] {1, 6, -1, 0, -5, -6, -3},
      new long[] {1, -2, -1, 0, 3, 2, 1});
  }

}
