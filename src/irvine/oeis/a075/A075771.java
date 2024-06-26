package irvine.oeis.a075;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-09-12 11:03

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A075771 Let n^2 = q*prime(n) + r with 0 &lt;= r &lt; prime(n); then a(n) = q + r.
 * a(n)=n^2-(prime(n)-1)*floor(n^2/prime(n))
 * @author Georg Fischer
 */
public class A075771 extends LambdaSequence {

  /** Construct the sequence. */
  public A075771() {
    super(1, n -> Z.valueOf(n).multiply(n).subtract(Functions.PRIME.z(n).subtract(Z.ONE).multiply(Z.valueOf(n).multiply(n).divide(Functions.PRIME.z(n)))));
  }
}
