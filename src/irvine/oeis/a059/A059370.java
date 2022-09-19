package irvine.oeis.a059;

import irvine.oeis.triangle.Inverse;
import irvine.oeis.triangle.ReversedRowTriangle;

/**
 * A059370 Triangle of numbers obtained by inverting infinite matrix defined in A059369, read from right to left.
 * @author Sean A. Irvine
 */
public class A059370 extends ReversedRowTriangle {

  /** Construct the sequence. */
  public A059370() {
    super(new Inverse(new ReversedRowTriangle(new A059369())));
  }
}
