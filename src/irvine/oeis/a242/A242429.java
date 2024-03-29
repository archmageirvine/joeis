package irvine.oeis.a242;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-08-22 13:29

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A242429 Length of longest chain of nonempty proper subsemigroups of the monoid of partial injective order-preserving functions of a chain with n elements.
 * a(n)=-2-n+sum(i=0,n,binom(n,i)*(binom(n,i)+3)/2);
 * @author Georg Fischer
 */
public class A242429 extends LambdaSequence {

  /** Construct the sequence. */
  public A242429() {
    super(1, n -> (Z.TWO.negate()).subtract(n).add(Integers.SINGLETON.sum(0, n, i -> Binomial.binomial(n, i).multiply(Binomial.binomial(n, i).add(Z.THREE)).divide(Z.TWO))));
  }
}
