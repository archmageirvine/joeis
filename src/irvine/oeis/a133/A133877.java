package irvine.oeis.a133;

import irvine.oeis.recur.PaddingSequence;

/**
 * A133877 n modulo 7 repeated 7 times.
 * @author Georg Fischer
 */
public class A133877 extends PaddingSequence {

  /** Construct the sequence. */
  public A133877() {
    super(new long[] {}, new long[]
      {1, 1, 1, 1, 1, 1, 1
        , 2, 2, 2, 2, 2, 2, 2
        , 3, 3, 3, 3, 3, 3, 3
        , 4, 4, 4, 4, 4, 4, 4
        , 5, 5, 5, 5, 5, 5, 5
        , 6, 6, 6, 6, 6, 6, 6
        , 0, 0, 0, 0, 0, 0, 0
      });
  }
}
