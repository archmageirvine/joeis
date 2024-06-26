package irvine.oeis.a086;
// Generated by gen_seq4.pl 2023-09-07/lambda at 2023-09-07 22:53

import irvine.math.polynomial.CyclotomicPolynomials;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A086780 Number of negative terms in n-th cyclotomic polynomial.
 * @author Georg Fischer
 */
public class A086780 extends LambdaSequence {

  /** Construct the sequence. */
  public A086780() {
    super(1, n -> CyclotomicPolynomials.cyclotomic(n).aggregate(Z.ZERO, (aggr, cf) -> cf.compareTo(Z.ZERO) < 0 ? aggr.add(1) : aggr));
  }
}
