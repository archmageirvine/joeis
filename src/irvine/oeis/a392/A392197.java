package irvine.oeis.a392;

import irvine.oeis.IntersectionSequence;
import irvine.oeis.a174.A174905;
import irvine.oeis.a298.A298856;

/**
 * A392197 allocated for Omar E. Pol.
 * @author Sean A. Irvine
 */
public class A392197 extends IntersectionSequence {

  /** Construct the sequence. */
  public A392197() {
    super(1, new A174905(), new A298856());
  }
}
