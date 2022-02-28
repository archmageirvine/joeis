package irvine.oeis.a056;
// manually 2022-02-25

import irvine.oeis.a010.A010048;
import irvine.oeis.triangle.TriangleSelector;

/**
 * A056568 Fibonomial coefficients.
 * a(n) = A010048(n+10, 10)
 * @author Georg Fischer
 */
public class A056568 extends TriangleSelector {

  /** Construct the sequence. */
  public A056568() {
    super(0, new A010048(), 0, n -> new int[] {n + 10, 10});
  }
}
