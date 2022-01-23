package irvine.oeis.a056;
// manually triselect

import irvine.oeis.triangle.TriangleSelector;

/**
 * A056243 Third diagonal of triangle A056242.
 * @author Georg Fischer
 */
public class A056243 extends TriangleSelector {

  /** Construct the sequence. */
  public A056243() {
    super(3, new A056242(), 1, n -> new int[]{n, n - 2});
  }
}

