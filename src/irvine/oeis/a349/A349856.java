package irvine.oeis.a349;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-08-27 21:29

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A349856 Expansion of Sum_{k&gt;=0} x^k/(1 + k^2 * x).
 * a(n)=sum(k=0,n,(-k^2)^(n-k))
 * @author Georg Fischer
 */
public class A349856 extends LambdaSequence {

  /** Construct the sequence. */
  public A349856() {
    super(0, n -> Integers.SINGLETON.sum(0, n, k -> Z.valueOf((long) -k * k).pow(n - k)));
  }
}
