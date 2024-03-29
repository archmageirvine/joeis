package irvine.oeis.a295;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-09-12 11:03

import irvine.factor.prime.Puma;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A295630 Number of partitions of n into two distinct parts that are not both prime.
 * a(n)=sum(i=1, floor((n-1)/2), 1-(primepi(i)-primepi(i-1))*(primepi(n-i)-primepi(n-i-1)))
 * @author Georg Fischer
 */
public class A295630 extends LambdaSequence {

  /** Construct the sequence. */
  public A295630() {
    super(1, n -> Integers.SINGLETON.sum(1, (n - 1) / 2, i -> Z.ONE.subtract(Puma.primePiZ(i).subtract(Puma.primePiZ(i - 1)).multiply(Puma.primePiZ(n - i).subtract(Puma.primePiZ(n - i - 1))))));
  }
}
