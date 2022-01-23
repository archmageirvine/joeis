package irvine.oeis.a054;
// manually triselect

import irvine.oeis.triangle.TriangleSelector;

/**
 * A054118 Subdiagonal T(n,n-3), array T as in A054115.
 * @author Georg Fischer
 */
public class A054118 extends TriangleSelector {

  /** Construct the sequence. */
  public A054118() {
    super(3, new A054115(), 0, n -> new int[]{n, n - 3});
  }
}

