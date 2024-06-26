package irvine.oeis.a317;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-08-24 21:51

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A317483 Circuit rank of the n-Bruhat graph.
 * a(n)=n!*(n-1)\2 - n! + 1
 * @author Georg Fischer
 */
public class A317483 extends LambdaSequence {

  /** Construct the sequence. */
  public A317483() {
    super(1, n -> Functions.FACTORIAL.z(n).multiply(Z.valueOf(n - 1)).divide(Z.TWO).subtract(Functions.FACTORIAL.z(n)).add(Z.ONE));
  }
}
