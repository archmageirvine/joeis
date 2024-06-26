package irvine.oeis.a175;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-08-24 21:51

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A175624 a(n) = n! modulo n*(n+1)*(n+2)/3.
 * a(n) = n! % (n*(n+1)*(n+2)/3);
 * @author Georg Fischer
 */
public class A175624 extends LambdaSequence {

  /** Construct the sequence. */
  public A175624() {
    super(1, n -> Functions.FACTORIAL.z(n).mod(Z.valueOf(n).multiply(Z.valueOf(n + 1)).multiply(Z.valueOf(n + 2)).divide(Z.THREE)));
  }
}
