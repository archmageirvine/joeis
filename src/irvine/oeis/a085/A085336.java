package irvine.oeis.a085;

import irvine.oeis.IntersectionSequence;
import irvine.oeis.a003.A003072;
import irvine.oeis.a003.A003325;

/**
 * A085336 Numbers which are sums of two and also sums of three positive cubes.
 * @author Sean A. Irvine
 */
public class A085336 extends IntersectionSequence {

  /** Construct the sequence. */
  public A085336() {
    super(1, new A003072(), new A003325());
  }
}  
