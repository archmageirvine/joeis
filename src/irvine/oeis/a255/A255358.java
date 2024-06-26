package irvine.oeis.a255;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-08-28 19:36

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A255358 Product_{k=0..n} (k^3)!.
 * a(n)=prod(k=0,n,(k^3)!)
 * @author Georg Fischer
 */
public class A255358 extends LambdaSequence {

  /** Construct the sequence. */
  public A255358() {
    super(0, n -> Integers.SINGLETON.product(0, n, k -> Functions.FACTORIAL.z(Z.valueOf(k).pow(3))));
  }
}
