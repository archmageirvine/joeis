package irvine.oeis.a294;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-08-28 19:36

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A294146 Sum of the larger parts of the partitions of n into two parts with smaller part squarefree.
 * a(n)=sum(i=1,floor(n/2),(n-i)*moebius(i)^2)
 * @author Georg Fischer
 */
public class A294146 extends LambdaSequence {

  /** Construct the sequence. */
  public A294146() {
    super(1, n -> Integers.SINGLETON.sum(1, n / 2, i -> Z.valueOf(n - i).multiply(Z.valueOf(Functions.MOBIUS.i(i)).square())));
  }
}
