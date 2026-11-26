package irvine.oeis.a274;

import irvine.math.group.BinaryLinearMatrixCounts;
import irvine.oeis.LambdaSequence;

/**
 * A274314 a(n) = number of squares in GL(n,2), the ring of invertible n X n matrices over GF(2).
 * @author Gregory Morse
 */
public class A274314 extends LambdaSequence {

  /** Construct the sequence. */
  public A274314() {
    super(0, n -> BinaryLinearMatrixCounts.count(n.intValue(), BinaryLinearMatrixCounts.Type.SQUARE));
  }
}
