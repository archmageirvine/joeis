package irvine.oeis.a275;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-09-12 11:03

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A275378 Number of odd prime factors (with multiplicity) of generalized Fermat number 5^(2^n) + 1.
 * a(n)=bigomega((5^(2^n)+1)/2)
 * @author Georg Fischer
 */
public class A275378 extends LambdaSequence {

  /** Construct the sequence. */
  public A275378() {
    super(0, n -> Z.valueOf(Jaguar.factor(Z.FIVE.pow(Z.ONE.shiftLeft(n)).add(Z.ONE).divide2()).bigOmega()));
  }
}
