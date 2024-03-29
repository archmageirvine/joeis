package irvine.oeis.a199;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-08-27 20:43

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A199806 Alternating LCM-sum: a(n) = Sum_{k=1..n} (-1)^(k-1)*lcm(k,n).
 * a(n)=-sum(k=1,n,(-1)^k*lcm(k,n))
 * @author Georg Fischer
 */
public class A199806 extends LambdaSequence {

  /** Construct the sequence. */
  public A199806() {
    super(1, n -> Z.ZERO.subtract(Integers.SINGLETON.sum(1, n, k -> Z.NEG_ONE.pow(k).multiply(Z.valueOf(k).lcm(n)))));
  }
}
