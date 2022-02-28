package irvine.oeis.a056;
// manually 2022-02-25

import irvine.oeis.a010.A010048;
import irvine.oeis.triangle.TriangleSelector;

/**
 * A056567 Fibonomial coefficients.
 * a(n) = A010048(n+9, 9)
 * @author Georg Fischer
 */
public class A056567 extends TriangleSelector {

  /** Construct the sequence. */
  public A056567() {
    super(0, new A010048(), 0, n -> new int[] {n + 9, 9});
  }
}
