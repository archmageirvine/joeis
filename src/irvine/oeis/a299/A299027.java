package irvine.oeis.a299;
// manually deris2/weighx at 2021-11-04

import irvine.oeis.transform.WeighTransformSequence;
import irvine.oeis.a167.A167934;

/**
 * A299027 Number of compositions of n whose standard factorization into Lyndon words has all distinct weakly increasing factors.
 * Weigh transform of A167934.
 * @author Georg Fischer
 */
public class A299027 extends WeighTransformSequence {

  /** Construct the sequence. */
  public A299027() {
    super(new A167934());
    next();
  }
}
