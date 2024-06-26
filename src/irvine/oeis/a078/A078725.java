package irvine.oeis.a078;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-09-12 11:03

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A078725 a(n) = prime(n*(n+1)/2+4).
 * a(n)=prime((n*(n+1))/2+4)
 * @author Georg Fischer
 */
public class A078725 extends LambdaSequence {

  /** Construct the sequence. */
  public A078725() {
    super(0, n -> Functions.PRIME.z(Z.valueOf((long) n * n + n * 1L).divide2().add(Z.FOUR)));
  }
}
