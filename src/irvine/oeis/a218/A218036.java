package irvine.oeis.a218;
// Generated by gen_seq4.pl 2025-01-03.ack/trilambn at 2025-01-06 00:11

import irvine.math.z.Z;
import irvine.oeis.triangle.LambdaTriangle;

/**
 * A218036 a(n) = (n+1) + (n+3/2)*H(n) - (H(n)^3)/2, where H(n) = A002024(n).
 * @author Georg Fischer
 */
public class A218036 extends LambdaTriangle {

  /** Construct the sequence. */
  public A218036() {
    super(1, 1, 1, (n, k) -> Z.valueOf(n + 1).multiply(k + 1));
  }
}
