package irvine.oeis.a133;

import irvine.oeis.recur.PaddingSequence;

/**
 * A133879 n modulo 9 repeated 9 times.
 * @author Georg Fischer
 */
public class A133879 extends PaddingSequence {

  /** Construct the sequence. */
  public A133879() {
    super(new long[] {}, new long[]
      {1, 1, 1, 1, 1, 1, 1, 1, 1
        , 2, 2, 2, 2, 2, 2, 2, 2, 2
        , 3, 3, 3, 3, 3, 3, 3, 3, 3
        , 4, 4, 4, 4, 4, 4, 4, 4, 4
        , 5, 5, 5, 5, 5, 5, 5, 5, 5
        , 6, 6, 6, 6, 6, 6, 6, 6, 6
        , 7, 7, 7, 7, 7, 7, 7, 7, 7
        , 8, 8, 8, 8, 8, 8, 8, 8, 8
        , 0, 0, 0, 0, 0, 0, 0, 0, 0
      });
  }
}
