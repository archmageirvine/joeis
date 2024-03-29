package irvine.oeis.a362;
// Generated by gen_seq4.pl 2024-03-22/trilamb0 at 2024-03-24 22:44

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.triangle.LambdaTriangle;

/**
 * A362787 Triangle read by rows, T(n, k) = (-1)^k * RisingFactorial(n, k) * FallingFactorial(k - n, k).
 * @author Georg Fischer
 */
public class A362787 extends LambdaTriangle {

  /** Construct the sequence. */
  public A362787() {
    super(0, 0, 0, (n, k) -> Integers.SINGLETON.product(0, k - 1, j -> Z.valueOf(j + n)).multiply(Integers.SINGLETON.product(0, k - 1, j -> Z.valueOf(j + n - k))));
  }
}
