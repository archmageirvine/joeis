package irvine.oeis.a294;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-08-28 19:36

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A294145 Sum of the smaller parts of the partitions of n into two parts with larger part squarefree.
 * a(n)=sum(i=1,floor(n/2),i*moebius(n-i)^2)
 * @author Georg Fischer
 */
public class A294145 extends LambdaSequence {

  /** Construct the sequence. */
  public A294145() {
    super(1, n -> Integers.SINGLETON.sum(1, n / 2, i -> Z.valueOf(i).multiply(Z.valueOf(Functions.MOBIUS.i(n - i)).square())));
  }
}
