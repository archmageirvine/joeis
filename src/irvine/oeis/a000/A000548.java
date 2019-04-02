package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.ComplementSequence;
import irvine.oeis.IntersectionSequence;

/**
 * A000548 Squares that are not the sum of 2 nonzero squares.
 * @author Sean A. Irvine
 */
public class A000548 extends IntersectionSequence {

  /** Default constructor. */
  public A000548() {
    super(new A000290(), new ComplementSequence(new A000404(), Z.ONE));
  }
}
