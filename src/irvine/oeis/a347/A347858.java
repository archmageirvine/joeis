package irvine.oeis.a347;
// Generated by gen_seq4.pl 2024-05-29/lambdan at 2024-05-29 02:16

import irvine.math.q.Q;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A347858 a(n) = (9*n)!/((3*n)!*(2*n)!) * (n/2)!/(9*n/2)!.
 * @author Georg Fischer
 */
public class A347858 extends LambdaSequence {

  /** Construct the sequence. */
  public A347858() {
    super(0, n -> new Q(Binomial.binomial(9L * n, 3L * n).multiply(Binomial.binomial(6L * n, 2L * n))).divide(Binomial.binomial(new Q(9L * n, 2), Z.valueOf(4L * n))).num());
  }
}
