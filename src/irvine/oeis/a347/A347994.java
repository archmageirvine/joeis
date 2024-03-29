package irvine.oeis.a347;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-08-25 13:33

import irvine.math.factorial.MemoryFactorial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.oeis.LambdaSequence;

/**
 * A347994 a(n) = n! * Sum_{k=1..n-1} (-1)^(k+1) * n^(n-k-2) / (n-k-1)!.
 * a(n) = n! * sum(k=1,n-1,(-1)^(k+1)*n^(n-k-2)/(n-k-1)!);
 * @author Georg Fischer
 */
public class A347994 extends LambdaSequence {

  /** Construct the sequence. */
  public A347994() {
    super(1, n -> new Q(MemoryFactorial.SINGLETON.factorial(n)).multiply(Rationals.SINGLETON.sum(1, n - 1, k -> ((((k + 1) & 1) == 0) ? Q.ONE : Q.NEG_ONE).multiply(new Q(n).pow(n - k - 2)).divide(MemoryFactorial.SINGLETON.factorial(n - k - 1)))).num());
  }
}
