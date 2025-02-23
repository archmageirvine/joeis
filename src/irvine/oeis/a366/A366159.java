package irvine.oeis.a366;
// Generated by gen_seq4.pl 2025-02-10.ack/trilambn at 2025-02-10 21:26

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.triangle.LambdaTriangle;

/**
 * A366159 Triangle read by rows: T(n, k) = Sum_{i=0..k-2} (-1)^(i+2) * (k-i-1)^n * binomial(k,i).
 * @author Georg Fischer
 */
public class A366159 extends LambdaTriangle {

  /** Construct the sequence. */
  public A366159() {
    super(2, 2, 2, (n, k) -> Integers.SINGLETON.sum(0, k - 2, i -> Z.NEG_ONE.pow(i + 2).multiply(Z.valueOf(k - i - 1).pow(n)).multiply(Binomial.binomial(k, i))));
  }
}
