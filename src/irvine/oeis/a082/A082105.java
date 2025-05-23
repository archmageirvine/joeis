package irvine.oeis.a082;
// Generated by gen_seq4.pl 2025-04-22.ack/arrlamb at 2025-04-22 22:21

import irvine.math.z.Z;
import irvine.oeis.triangle.LambdaArray;

/**
 * A082105 Array A(n, k) = (k*n)^2 + 4*(k*n) + 1, read by antidiagonals.
 * @author Georg Fischer
 */
public class A082105 extends LambdaArray {

  /** Construct the sequence. */
  public A082105() {
    super(0, 0, 0, +1, (n, k) -> Z.valueOf(k * n).square().add(4 * (k * n) + 1));
  }
}
