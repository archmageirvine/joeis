package irvine.oeis.a271;
// Generated by gen_seq4.pl 2024-08-18.ack/lambdan at 2024-08-18 22:15

import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A271924 Denominator of (1/3)*(Product_{j=0..n-1} (((2*j+1)*(3*j+4))/((j+1)*(6*j+1))) - 1).
 * @author Georg Fischer
 */
public class A271924 extends LambdaSequence {

  /** Construct the sequence. */
  public A271924() {
    super(1, n -> Rationals.SINGLETON.product(0, n - 1, j -> new Q(Z.valueOf(2L * j + 1).multiply(3L * j + 4), Z.valueOf(j + 1).multiply(6L * j + 1))).subtract(1).divide(3).den());
  }
}
