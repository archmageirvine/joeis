package irvine.oeis.a392;

import irvine.oeis.IntersectionSequence;
import irvine.oeis.a390.A390539;

/**
 * A392907 Achilles numbers that are neither biquadratefree nor cubefull.
 * @author Sean A. Irvine
 */
public class A392907 extends IntersectionSequence {

  /** Construct the sequence. */
  public A392907() {
    super(new A390539(), new A392134());
  }
}
