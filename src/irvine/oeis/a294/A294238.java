package irvine.oeis.a294;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-08-28 19:36

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A294238 Sum of the parts in the partitions of n into two parts with smaller part nonsquarefree.
 * a(n)=n*sum(k=1,floor(n/2),(1-moebius(k)^2))
 * @author Georg Fischer
 */
public class A294238 extends LambdaSequence {

  /** Construct the sequence. */
  public A294238() {
    super(1, n -> Z.valueOf(n).multiply(Integers.SINGLETON.sum(1, n / 2, k -> Z.ONE.subtract(Z.valueOf(Functions.MOBIUS.i(k)).square()))));
  }
}
