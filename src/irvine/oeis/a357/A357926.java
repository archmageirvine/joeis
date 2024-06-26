package irvine.oeis.a357;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-08-22 13:29

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.oeis.LambdaSequence;

/**
 * A357926 a(n) = Sum_{k=0..floor(n/4)} Stirling2(n - 3*k,n - 4*k).
 * a(n) = sum(k=0,n\4,stirl(n-3*k,n-4*k,2));
 * @author Georg Fischer
 */
public class A357926 extends LambdaSequence {

  /** Construct the sequence. */
  public A357926() {
    super(0, n -> Integers.SINGLETON.sum(0, n / 4, k -> Functions.STIRLING2.z(n - 3L * k, n - 4L * k)));
  }
}
