package irvine.oeis.a317;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-08-21 21:22

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A317172 a(n) = n! * [x^n] 1/(1 - n*log(1 + x)).
 * @author Georg Fischer
 */
public class A317172 extends LambdaSequence {

  /** Construct the sequence. */
  public A317172() {
    super(0, n -> Integers.SINGLETON.sum(0, n, k -> Functions.FACTORIAL.z(k).multiply(Z.valueOf(n).pow(k)).multiply(Functions.STIRLING1.z(n, k))));
  }
}
