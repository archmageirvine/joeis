package irvine.oeis.a390;

import irvine.oeis.IntersectionSequence;
import irvine.oeis.a052.A052486;
import irvine.oeis.a362.A362147;

/**
 * A390539 Achilles numbers that are not cubefull.
 * @author Sean A. Irvine
 */
public class A390539 extends IntersectionSequence {

  /** Construct the sequence. */
  public A390539() {
    super(new A052486(), new A362147());
  }
}
