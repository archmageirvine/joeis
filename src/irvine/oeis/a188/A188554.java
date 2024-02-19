package irvine.oeis.a188;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A188554 Number of 3 X n binary arrays without the pattern 0 1 diagonally, vertically, antidiagonally or horizontally.
 * @author Georg Fischer
 */
public class A188554 extends LambdaSequence {

  /** Construct the sequence. */
  public A188554() {
    super(0, n -> n == 0 ? Z.ONE : Binomial.binomial(n + 1, 3).add(2L * (n + 1)));
  }
}
