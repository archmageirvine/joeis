package irvine.oeis.a345;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-09-12 11:03

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A345646 a(n) = Sum_{k=0..n} (4*n)! / (k! * (n-k)!)^4.
 * a(n)=sum(k=0, n, (4*n)!/(k!*(n-k)!)^4)
 * @author Georg Fischer
 */
public class A345646 extends LambdaSequence {

  /** Construct the sequence. */
  public A345646() {
    super(0, n -> Integers.SINGLETON.sum(0, n, k -> Functions.FACTORIAL.z(4 * n).divide(Functions.FACTORIAL.z(k).multiply(Functions.FACTORIAL.z(n - k)).pow(Z.FOUR))));
  }
}
