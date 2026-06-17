package irvine.oeis.a085;

import irvine.oeis.IntersectionSequence;
import irvine.oeis.a003.A003327;

/**
 * A085337 Numbers which are sums of two, three and four cubes.
 * @author Georg Fischer
 */
public class A085337 extends IntersectionSequence {

  /** Construct the sequence. */
  public A085337() {
    super(new A085336(), new A003327());
  }
}
