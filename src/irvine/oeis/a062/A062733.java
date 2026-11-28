package irvine.oeis.a062;

import irvine.math.group.BinaryLinearMatrixCounts;
import irvine.oeis.LambdaSequence;

/**
 * A062733 Maximal degree of an irreducible representation of SL(n,2).
 * @author Gregory Morse
 */
public class A062733 extends LambdaSequence {

  /** Construct the sequence. */
  public A062733() {
    super(1, n -> BinaryLinearMatrixCounts.largestCharacterDegree(n.intValue()));
  }
}
