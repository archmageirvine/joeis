package irvine.oeis.a262;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-09-12 11:03

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A262351 Sum of the parts in the partitions of n into exactly two squarefree parts.
 * a(n)=n*sum(i=1, floor(n/2), moebius(i)^2*moebius(n-i)^2)
 * @author Georg Fischer
 */
public class A262351 extends LambdaSequence {

  /** Construct the sequence. */
  public A262351() {
    super(1, n -> Z.valueOf(n).multiply(Integers.SINGLETON.sum(1, n / 2, i -> Z.valueOf(Functions.MOBIUS.i(i)).square().multiply(Z.valueOf(Functions.MOBIUS.i(n - i)).square()))));
  }
}
