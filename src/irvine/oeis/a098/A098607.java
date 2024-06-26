package irvine.oeis.a098;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-09-12 11:03

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.oeis.LambdaSequence;

/**
 * A098607 Sum of all matrix elements M(i,j) = (i*j)/(i+j) multiplied by (2*n)!/n!.
 * a(n)=(2*n)!/n!*sum(j=1, n, sum(i=1, n, (i*j)/(i+j)))
 * @author Georg Fischer
 */
public class A098607 extends LambdaSequence {

  /** Construct the sequence. */
  public A098607() {
    super(0, n -> Rationals.SINGLETON.sum(1, n, j -> Rationals.SINGLETON.sum(1, n, i ->
      new Q((long) i * j, i + j))).multiply(new Q(Functions.FACTORIAL.z(2 * n), Functions.FACTORIAL.z(n))).num());
  }
}
