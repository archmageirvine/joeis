package irvine.oeis.a143;
// manually padding 2021-08-17

import irvine.oeis.PaddingSequence;

/**
 * A143721 Aliquot sequence starting at 38.
 * @author Georg Fischer
 */
public class A143721 extends PaddingSequence {

  /** Construct the sequence. */
  public A143721() {
    super(new long[] {38, 22, 14, 10, 8, 7, 1}, new long[] {0});
  }
}
