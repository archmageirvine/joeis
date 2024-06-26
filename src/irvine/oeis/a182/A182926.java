package irvine.oeis.a182;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-08-27 21:29

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A182926 Row sums of absolute values of A182928.
 * a(n)=sumdiv(n,d,n!/(d*((n/d)!)^d))
 * @author Georg Fischer
 */
public class A182926 extends LambdaSequence {

  /** Construct the sequence. */
  public A182926() {
    super(1, n -> Integers.SINGLETON.sumdiv(n, d -> Functions.FACTORIAL.z(n).divide(Z.valueOf(d).multiply(Functions.FACTORIAL.z(n / d).pow(d)))));
  }
}
