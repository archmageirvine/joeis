package irvine.oeis.a120;
// Generated by gen_seq4.pl 2024-10-20.ack/trilambn at 2024-10-20 00:12

import irvine.math.function.Functions;
import irvine.oeis.triangle.LambdaTriangle;

/**
 * A120666 Triangle read by rows:  T(n, k) = (n*k)!/(n!)^k.
 * @author Georg Fischer
 */
public class A120666 extends LambdaTriangle {

  /** Construct the sequence. */
  public A120666() {
    super(1, 1, 1, (n, k) -> Functions.FACTORIAL.z(n * k).divide(Functions.FACTORIAL.z(n).pow(k)));
  }
}
