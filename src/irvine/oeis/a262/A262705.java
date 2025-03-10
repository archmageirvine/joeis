package irvine.oeis.a262;
// Generated by gen_seq4.pl 2025-02-22.ack/trilamb0 at 2025-02-22 21:47

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.triangle.LambdaTriangle;

/**
 * A262705 Triangle: Newton expansion of C(n,m)^4, read by rows.
 * @author Georg Fischer
 */
public class A262705 extends LambdaTriangle {

  /** Construct the sequence. */
  public A262705() {
    super(0, 0, 0, (n, m) -> Integers.SINGLETON.sum(0, n, j -> Z.NEG_ONE.pow(n - j).multiply(Binomial.binomial(n, j)).multiply(Binomial.binomial(j, m).pow(4))));
  }
}
