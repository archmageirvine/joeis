package irvine.oeis.a133;

import irvine.oeis.recur.PaddingSequence;

/**
 * A133876 n modulo 6 repeated 6 times.
 * @author Georg Fischer
 */
public class A133876 extends PaddingSequence {

  /** Construct the sequence. */
  public A133876() {
    super(new long[] {}, new long[]
      {1, 1, 1, 1, 1, 1
        , 2, 2, 2, 2, 2, 2
        , 3, 3, 3, 3, 3, 3
        , 4, 4, 4, 4, 4, 4
        , 5, 5, 5, 5, 5, 5
        , 0, 0, 0, 0, 0, 0
      });
  }
}
