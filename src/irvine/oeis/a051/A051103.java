package irvine.oeis.a051;
// Generated by gen_seq4.pl hypergeon at 2023-11-10 15:47

import irvine.math.z.Z;
import irvine.oeis.HypergeometricSequence;

/**
 * A051103 Numerator of a certain Selberg integral.
 * @author Georg Fischer
 */
public class A051103 extends HypergeometricSequence {

  /** Construct the sequence. */
  public A051103() {
    super(1, 3, 2, "[[0,-1],[1],[1],[2, 1],[1/2,-1],[1/4]]", "", (n, v) -> v.multiply(Z.ONE.shiftLeft(n)).multiply(3).divide(Z.valueOf(n + 1).square().multiply(2L * n + 1).multiply(4L * n + 3)).num());
  }
}
