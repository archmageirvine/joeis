package irvine.oeis.a007;

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterSequence;

/**
 * A007940 Noncubes such that some permutation of digits is a cube.
 * @author Sean A. Irvine
 */
public class A007940 extends FilterSequence {

  /** Construct the sequence. */
  public A007940() {
    super(new A007939(), k -> !Predicates.CUBE.is(k));
  }
}
