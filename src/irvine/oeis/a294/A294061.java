package irvine.oeis.a294;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-08-28 19:36

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A294061 Sum of the differences of the larger and smaller parts in the partitions of n into two parts with the larger part squarefree.
 * a(n)=sum(i=1,floor(n/2),(n-2*i)*moebius(n-i)^2)
 * @author Georg Fischer
 */
public class A294061 extends LambdaSequence {

  /** Construct the sequence. */
  public A294061() {
    super(1, n -> Integers.SINGLETON.sum(1, n / 2, i -> Z.valueOf(n - 2L * i).multiply(Z.valueOf(Functions.MOBIUS.i(n - i)).square())));
  }
}
