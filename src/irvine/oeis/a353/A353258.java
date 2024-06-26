package irvine.oeis.a353;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-08-22 13:29

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A353258 Expansion of Sum_{k&gt;=0} x^k * Product_{j=0..k-1} (3 * j - x).
 * a(n) = sum(k=0,n\2,(-1)^k*3^(n-2*k)*abs(stirl(n-k,k,1)));
 * @author Georg Fischer
 */
public class A353258 extends LambdaSequence {

  /** Construct the sequence. */
  public A353258() {
    super(0, n -> Integers.SINGLETON.sum(0, n / 2, k -> Z.NEG_ONE.pow(k).multiply(Z.THREE.pow(n - 2L * k)).multiply(Functions.STIRLING1.z(n - k, k).abs())));
  }
}
