package irvine.oeis.a210;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-08-28 19:36

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A210029 Number of sequences over the alphabet of n symbols of length 2n which have n distinct symbols. Also number of placements of 2n balls into n cells where no cell is empty.
 * a(n)=sum(v=0,n-1,((-1)^v*binom(n,v)*(n-v)^(2*n)))
 * @author Georg Fischer
 */
public class A210029 extends LambdaSequence {

  /** Construct the sequence. */
  public A210029() {
    super(1, n -> Integers.SINGLETON.sum(0, n - 1, v -> Z.NEG_ONE.pow(v).multiply(Binomial.binomial(n, v)).multiply(Z.valueOf(n - v).pow(2L * n))));
  }
}
