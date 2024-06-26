package irvine.oeis.a249;
// Generated by gen_seq4.pl 2024-06-21/lambdan at 2024-06-22 00:01

import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A249664 In the n-th row of Pascal's triangle, an odious entry is replaced by 1, an evil entry is replaced by 0 and the n-th row is converted to decimal.
 * @author Georg Fischer
 */
public class A249664 extends LambdaSequence {

  /** Construct the sequence. */
  public A249664() {
    super(0, n -> Integers.SINGLETON.sum(0, n, i -> Functions.THUE_MORSE.z(Binomial.binomial(n, i)).multiply(Z.TWO.pow(i))));
  }
}
