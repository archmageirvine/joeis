package irvine.oeis.a127;
// Generated by gen_seq4.pl 2023-12-24/lambdan at 2023-12-26 12:51

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A127769 a(n)=3*C(4n-2,2n)/(2n+1)-2*0^n.
 * @author Georg Fischer
 */
public class A127769 extends LambdaSequence {

  /** Construct the sequence. */
  public A127769() {
    super(0, n -> (n == 0) ? Z.ONE : Binomial.binomial(4L * n - 2, 2L * n).multiply(3).divide(2L * n + 1));
  }
}
