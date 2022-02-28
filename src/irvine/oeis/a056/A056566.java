package irvine.oeis.a056;
// manually 2022-02-25

import irvine.oeis.a010.A010048;
import irvine.oeis.triangle.TriangleSelector;

/**
 * A056566 Fibonomial coefficients.
 * a(n) = A010048(n+8, 8)
 * @author Georg Fischer
 */
public class A056566 extends TriangleSelector {

  /** Construct the sequence. */
  public A056566() {
    super(0, new A010048(), 0, n -> new int[] {n + 8, 8});
  }
}
