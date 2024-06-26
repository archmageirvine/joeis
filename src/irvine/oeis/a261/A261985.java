package irvine.oeis.a261;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-09-12 11:03

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A261985 Sum of the smaller parts of the partitions of n into two squarefree parts.
 * a(n)=sum(i=1, floor(n/2), i*moebius(i)^2*moebius(n-i)^2)
 * @author Georg Fischer
 */
public class A261985 extends LambdaSequence {

  /** Construct the sequence. */
  public A261985() {
    super(1, n -> Integers.SINGLETON.sum(1, n / 2, i -> Z.valueOf(i).multiply(Z.valueOf(Functions.MOBIUS.i(i)).square()).multiply(Z.valueOf(Functions.MOBIUS.i(n - i)).square())));
  }
}
