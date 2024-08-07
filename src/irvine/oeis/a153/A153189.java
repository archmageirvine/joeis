package irvine.oeis.a153;
// Generated by gen_seq4.pl 2024-03-22/trilamb0 at 2024-03-24 22:44

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.triangle.LambdaTriangle;

/**
 * A153189 Triangle T(n,k) = Product_{j=0..k} n*j+1.
 * @author Georg Fischer
 */
public class A153189 extends LambdaTriangle {

  /** Construct the sequence. */
  public A153189() {
    super(0, 0, 0, (n, k) -> Integers.SINGLETON.product(0, k, j -> Z.valueOf((long) n * j + 1)));
  }
}
