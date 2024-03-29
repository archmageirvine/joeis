package irvine.oeis.a357;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-08-22 13:29

import irvine.math.z.Integers;
import irvine.math.z.Stirling;
import irvine.oeis.LambdaSequence;

/**
 * A357835 a(n) = Sum_{k=0..floor((n-1)/3)} Stirling1(n,3*k+1).
 * a(n) = sum(k=0,(n-1)\3,stirl(n,3*k+1,1));
 * @author Georg Fischer
 */
public class A357835 extends LambdaSequence {

  /** Construct the sequence. */
  public A357835() {
    super(0, n -> Integers.SINGLETON.sum(0, (n - 1) / 3, k -> Stirling.firstKind(n, 3L * k + 1)));
  }
}
