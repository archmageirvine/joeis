package irvine.oeis.a351;
// Generated by gen_seq4.pl 2025-02-10.ack/trilambn at 2025-02-10 21:26

import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.triangle.LambdaTriangle;

/**
 * A351839 Triangle read by rows: T(n, k) = A027375(n)*Sum_{m=1..floor(n/k)} binomial(n, k*m).
 * @author Georg Fischer
 */
public class A351839 extends LambdaTriangle {

  /** Construct the sequence. */
  public A351839() {
    super(1, 1, 1, (n, k) -> Integers.SINGLETON.sumdiv(k, d -> Z.TWO.pow(k / d).multiply(Functions.MOEBIUS.z(d))).multiply(Integers.SINGLETON.sum(1, n / k, m -> Binomial.binomial(n, (long) k * m))));
  }
}
