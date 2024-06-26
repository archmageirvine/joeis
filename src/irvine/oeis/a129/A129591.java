package irvine.oeis.a129;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-08-24 21:51

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A129591 For each permutation p of {1,2,...,n} define min(p) = min{ p(i) + i : i = 1..n }; a(n) is the sum of min(p) of all p.
 * a(n)=sum(k=0,n-1,(n-k+1)*k!*((k+1)^(n-k)-k^(n-k)))
 * @author Georg Fischer
 */
public class A129591 extends LambdaSequence {

  /** Construct the sequence. */
  public A129591() {
    super(1, n -> Integers.SINGLETON.sum(0, n - 1, k -> Z.valueOf(n - k + 1).multiply(Functions.FACTORIAL.z(k)).multiply(Z.valueOf(k + 1).pow(n - k).subtract(Z.valueOf(k).pow(n - k)))));
  }
}
