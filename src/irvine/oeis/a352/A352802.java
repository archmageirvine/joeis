package irvine.oeis.a352;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-08-22 13:29

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A352802 Expansion of Sum_{k&gt;=0} x^k * Product_{j=0..k-1} (j + 3 * x).
 * a(n) = sum(k=0,n\2,3^k*abs(stirl(n-k,k,1)));
 * @author Georg Fischer
 */
public class A352802 extends LambdaSequence {

  /** Construct the sequence. */
  public A352802() {
    super(0, n -> Integers.SINGLETON.sum(0, n / 2, k -> Z.THREE.pow(k).multiply(Functions.STIRLING1.z(n - k, k).abs())));
  }
}
