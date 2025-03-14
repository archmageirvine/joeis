package irvine.oeis.a372;
// Generated by gen_seq4.pl 2025-02-12.ack/trilambn at 2025-02-12 23:23

import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.triangle.LambdaTriangle;

/**
 * A372245 Triangular array T(n,k) read by rows: column k is the expansion of e.g.f: exp(-2*x)*(exp(x)-1)^k/(2-exp(x)).
 * @author Georg Fischer
 */
public class A372245 extends LambdaTriangle {

  /** Construct the sequence. */
  public A372245() {
    super(0, 0, 0, (n, k) -> Integers.SINGLETON.sum(0, n, m -> Z.NEG_ONE.pow(((k > 0) ? 1 : 0) + m + n).multiply(Binomial.binomial(n, m)).multiply(Z.TWO.pow(n - m).subtract((k > 0) ? 1 : 0)).multiply(Integers.SINGLETON.sum((k < 1) ? 0 : k - 1, m, h -> Functions.FACTORIAL.z(h).multiply(Functions.STIRLING2.z(m, h))))));
  }
}
