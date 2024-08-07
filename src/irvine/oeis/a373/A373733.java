package irvine.oeis.a373;
// Generated by gen_seq4.pl 2024-07-20/lambdan at 2024-07-20 00:09

import irvine.math.function.Functions;
import irvine.oeis.LambdaSequence;

/**
 * A373733 Triangular numbers with tetrahedral indices: a(n) = (1/72) * (n*(n+1)*(n+2)*(n+3)*(n^2+2)).
 * @author Georg Fischer
 */
public class A373733 extends LambdaSequence {

  /** Construct the sequence. */
  public A373733() {
    super(0, n -> Functions.TRIANGULAR.z(Functions.TETRAHEDRAL.z(n)));
  }
}
