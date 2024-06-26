package irvine.oeis.a077;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-08-24 21:51

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.oeis.LambdaSequence;

/**
 * A077123 Let M_n be the n X n matrix M_(i,j) = i!-j! then the characteristic polynomial of M_n = x^n+a(n)*x^(n-2).
 * a(n)=sum(i=1,n,sum(j=1,i-1,(i!-j!)^2))
 * @author Georg Fischer
 */
public class A077123 extends LambdaSequence {

  /** Construct the sequence. */
  public A077123() {
    super(1, n -> Integers.SINGLETON.sum(1, n, i -> Integers.SINGLETON.sum(1, i - 1, j -> Functions.FACTORIAL.z(i).subtract(Functions.FACTORIAL.z(j)).square())));
  }
}
