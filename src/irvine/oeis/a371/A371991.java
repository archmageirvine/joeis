package irvine.oeis.a371;

import irvine.oeis.Combiner;
import irvine.oeis.a000.A000046;

/**
 * A371991 Number of different closest packings of equal spheres for hexagonal crystals having repeat period n.
 * @author Sean A. Irvine
 */
public class A371991 extends Combiner {

  /** Construct the sequence. */
  public A371991() {
    super(1, new A000046().skip(), new A371992(), SUBTRACT);
  }
}
