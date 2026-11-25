package irvine.oeis.a070;

import irvine.math.group.BinaryLinearMatrixCounts;
import irvine.oeis.LambdaSequence;

/**
 * A070731 Size of largest conjugacy class in GL(n,2).
 * @author Gregory Morse
 */
public class A070731 extends LambdaSequence {

  /** Construct the sequence. */
  public A070731() {
    super(1, n -> BinaryLinearMatrixCounts.largestClass(n.intValue()));
  }
}
