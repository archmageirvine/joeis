package irvine.oeis.a362;
// Generated by gen_seq4.pl 2024-03-22/trilamb0 at 2024-03-24 22:44

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.triangle.LambdaTriangle;

/**
 * A362588 Triangle read by rows, T(n, k) = RisingFactorial(n - k, k) * FallingFactorial(n, k).
 * @author Georg Fischer
 */
public class A362588 extends LambdaTriangle {

  /** Construct the sequence. */
  public A362588() {
    super(0, 0, 0, (n, k) -> Z.NEG_ONE.pow(k).multiply(Integers.SINGLETON.product(0, k - 1, j -> Z.valueOf(j + n - k))).multiply(Integers.SINGLETON.product(0, k - 1, j -> Z.valueOf(j - n))));
  }
}
