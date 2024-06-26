package irvine.oeis.a353;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-08-22 13:29

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A353262 Expansion of Sum_{k&gt;=0} x^(2*k)/Product_{j=1..k} (1 - 3 * j * x).
 * a(n) = sum(k=0,n\2,3^(n-2*k)*stirl(n-k,k,2));
 * @author Georg Fischer
 */
public class A353262 extends LambdaSequence {

  /** Construct the sequence. */
  public A353262() {
    super(0, n -> Integers.SINGLETON.sum(0, n / 2, k -> Z.THREE.pow(n - 2L * k).multiply(Functions.STIRLING2.z(n - k, k))));
  }
}
