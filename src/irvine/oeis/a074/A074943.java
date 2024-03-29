package irvine.oeis.a074;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-08-24 21:51

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A074943 tau(n) (mod 3).
 * a(n)=numdiv(n)%3
 * @author Georg Fischer
 */
public class A074943 extends LambdaSequence {

  /** Construct the sequence. */
  public A074943() {
    super(1, n -> Jaguar.factor(n).sigma0().mod(Z.THREE));
  }
}
