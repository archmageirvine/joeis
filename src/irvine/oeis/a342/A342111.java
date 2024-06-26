package irvine.oeis.a342;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-08-22 13:29

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A342111 a(n) = (-1)^n * Sum_{k=0..n} Stirling1(n,k) * Stirling1(n,n-k).
 * a(n) = (-1)^n*sum(k=0,n,stirl(n,k,1)*stirl(n,n-k,1));
 * @author Georg Fischer
 */
public class A342111 extends LambdaSequence {

  /** Construct the sequence. */
  public A342111() {
    super(0, n -> Z.NEG_ONE.pow(n).multiply(Integers.SINGLETON.sum(0, n, k -> Functions.STIRLING1.z(n, k).multiply(Functions.STIRLING1.z(n, n - k)))));
  }
}
