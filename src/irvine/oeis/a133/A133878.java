package irvine.oeis.a133;

import irvine.oeis.recur.PaddingSequence;

/**
 * A133878 n modulo 8 repeated 8 times.
 * @author Georg Fischer
 */
public class A133878 extends PaddingSequence {

  /** Construct the sequence. */
  public A133878() {
    super(new long[] {}, new long[]
      {1, 1, 1, 1, 1, 1, 1, 1
        , 2, 2, 2, 2, 2, 2, 2, 2
        , 3, 3, 3, 3, 3, 3, 3, 3
        , 4, 4, 4, 4, 4, 4, 4, 4
        , 5, 5, 5, 5, 5, 5, 5, 5
        , 6, 6, 6, 6, 6, 6, 6, 6
        , 7, 7, 7, 7, 7, 7, 7, 7
        , 0, 0, 0, 0, 0, 0, 0, 0
      });
  }
}
