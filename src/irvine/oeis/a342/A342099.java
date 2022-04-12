package irvine.oeis.a342;
// manually partprom/partprod at 2022-04-12 12:36

import irvine.oeis.PartialProductSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a000.A000182;

/**
 * A342099 Product of first n tangent numbers.
 * @author Georg Fischer
 */
public class A342099 extends PrependSequence {

  /** Construct the sequence. */
  public A342099() {
    super(new PartialProductSequence(new A000182()), 1);
  }
}
