package irvine.oeis.a346;
// Generated by gen_seq4.pl hypergeon at 2023-11-10 15:47

import irvine.math.z.Z;
import irvine.oeis.HypergeometricSequence;

/**
 * A346763 G.f. A(x) satisfies: A(x) = 1 / (1 - 3*x) + x * (1 - 3*x) * A(x)^3.
 * @author Georg Fischer
 */
public class A346763 extends HypergeometricSequence {

  /** Construct the sequence. */
  public A346763() {
    super(0, 3, 2, "[[1/3],[2/3],[0,-1],[1],[3/2],[-9/4]]", "", (n, v) -> v.multiply(Z.THREE.pow(n)).num());
  }
}
