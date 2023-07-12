package irvine.oeis.a243;
// manually deris/recordpos at 2022-04-27

import irvine.oeis.RecordPositionSubsequence;
import irvine.oeis.a055.A055941;

/**
 * A243112 a(n) is the smallest number that requires at least n adjacent bit swaps in order to pack all the ones to the right.
 * @author Georg Fischer
 */
public class A243112 extends RecordPositionSubsequence {

  /** Construct the sequence. */
  public A243112() {
    super(0, new A055941());
    setOffset(0);
  }
}
