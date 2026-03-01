package irvine.oeis.a091;
// manually 2026-02-27

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A091551 Second column (k=3) sequence of array ((7,2)-Stirling2) divided by 14.
 * @author Georg Fischer
 */
public class A091551 extends LambdaSequence {

  /** Construct the sequence. */
  public A091551() {
    super(2, n -> Integers.SINGLETON.product(0, n - 1, j -> Z.valueOf(5L * j + 2))
      .multiply(Integers.SINGLETON.product(0, n - 1, j -> Z.valueOf(5L * j + 1))
        .multiply(-3).add(Integers.SINGLETON.product(0, n - 1, j -> Z.valueOf(5L * j + 3)))).divide(84));
  }
}
