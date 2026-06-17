package irvine.oeis.a085;

import irvine.oeis.IntersectionSequence;
import irvine.oeis.a003.A003328;

/**
 * A085338 Numbers which are sums of two, three, four and also sums of five cubes.
 * @author Sean A. Irvine
 */
public class A085338 extends IntersectionSequence {

  /** Construct the sequence. */
  public A085338() {
    super(new A085337(), new A003328());
  }
}
