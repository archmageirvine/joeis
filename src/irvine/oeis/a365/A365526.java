package irvine.oeis.a365;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-09-13 11:40

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.oeis.LambdaSequence;

/**
 * A365526 a(n) = Sum_{k=0..floor((n-1)/4)} Stirling2(n,4*k+1).
 * a(n) = sum(k=0,floor((n-1)/4),stirl2(n,4*k+1))
 * @author Georg Fischer
 */
public class A365526 extends LambdaSequence {

  /** Construct the sequence. */
  public A365526() {
    super(0, n -> Integers.SINGLETON.sum(0, (n - 1) / 4, k -> Functions.STIRLING2.z(n, 4L * k + 1)));
  }
}
