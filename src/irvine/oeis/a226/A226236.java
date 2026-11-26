package irvine.oeis.a226;

import irvine.math.group.BinaryLinearMatrixCounts;
import irvine.oeis.LambdaSequence;

/**
 * A226236 Number of semisimple invertible n X n matrices over GF(2).
 * @author Gregory Morse
 */
public class A226236 extends LambdaSequence {

  /** Construct the sequence. */
  public A226236() {
    super(1, n -> BinaryLinearMatrixCounts.count(n.intValue(), BinaryLinearMatrixCounts.Type.SEMISIMPLE));
  }
}
