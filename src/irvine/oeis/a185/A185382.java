package irvine.oeis.a185;
// Generated by gen_seq4.pl 2024-05-25/lambdan at 2024-05-25 23:20

import irvine.math.z.Integers;
import irvine.oeis.DirectSequence;
import irvine.oeis.LambdaSequence;
import irvine.oeis.a001.A001223;

/**
 * A185382 Sum_{j=1..n-1} P(n)-P(j), where P(j) = A065091(j) is the j-th odd prime.
 * @author Georg Fischer
 */
public class A185382 extends LambdaSequence {

  private static final DirectSequence A001223 = new A001223();

  /** Construct the sequence. */
  public A185382() {
    super(1, n -> Integers.SINGLETON.sum(1, n - 1, j -> A001223.a(j + 1).multiply(j)));
  }
}
