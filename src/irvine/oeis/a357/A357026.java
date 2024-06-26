package irvine.oeis.a357;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-08-22 13:29

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A357026 E.g.f. satisfies A(x) = (1 - x)^(log(1 - x) * A(x)).
 * a(n) = sum(k=0,n\2,(2*k)!*(k+1)^(k-1)*abs(stirl(n,2*k,1))/k!);
 * @author Georg Fischer
 */
public class A357026 extends LambdaSequence {

  /** Construct the sequence. */
  public A357026() {
    super(0, n -> Integers.SINGLETON.sum(0, n / 2, k -> Functions.FACTORIAL.z(2 * k).multiply(Z.valueOf(k + 1).pow(k - 1)).multiply(Functions.STIRLING1.z(n, 2L * k).abs()).divide(Functions.FACTORIAL.z(k))));
  }
}
