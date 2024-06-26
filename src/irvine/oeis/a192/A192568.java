package irvine.oeis.a192;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-08-28 19:36

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.oeis.LambdaSequence;

/**
 * A192568 a(n) = sum(Stirling2(n,k)*Stirling2(n+1,k+1)*Stirling2(n+2,k+2),k=0..n).
 * a(n)=sum(k=0,n,stirl2(n,k)*stirl2(n+1,k+1)*stirl2(n+2,k+2))
 * @author Georg Fischer
 */
public class A192568 extends LambdaSequence {

  /** Construct the sequence. */
  public A192568() {
    super(0, n -> Integers.SINGLETON.sum(0, n, k -> Functions.STIRLING2.z(n, k).multiply(Functions.STIRLING2.z(n + 1, k + 1)).multiply(Functions.STIRLING2.z(n + 2, k + 2))));
  }
}
