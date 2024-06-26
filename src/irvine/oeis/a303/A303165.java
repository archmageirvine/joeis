package irvine.oeis.a303;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-08-28 19:36

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A303165 Sum of the squarefree differences |q-p| of the parts in the partitions of n into two distinct parts (p,q) where p &lt; q.
 * a(n)=sum(i=1,floor((n-1)/2),(n-2*i)*moebius(n-2*i)^2)
 * @author Georg Fischer
 */
public class A303165 extends LambdaSequence {

  /** Construct the sequence. */
  public A303165() {
    super(1, n -> Integers.SINGLETON.sum(1, (n - 1) / 2, i -> Z.valueOf(n - 2L * i).multiply(Z.valueOf(Functions.MOBIUS.i(n - 2L * i)).square())));
  }
}
