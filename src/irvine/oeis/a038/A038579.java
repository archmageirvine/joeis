package irvine.oeis.a038;

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A038579 Number of self-avoiding closed walks from 0 of area n in strip Z X {0,1,2}.
 * @author Sean A. Irvine
 */
public class A038579 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A038579() {
    super(0, new long[] {1, 2, 1, 4, 1, -2, -1},   
      new long[] {1, -2, -1, 0, 3, 2, 1});
  }

}

