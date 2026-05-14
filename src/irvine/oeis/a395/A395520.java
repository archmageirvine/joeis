package irvine.oeis.a395;

import irvine.oeis.DifferenceSequence;
import irvine.oeis.a036.A036349;

/**
 * A395520 allocated for James W Worley.
 * @author Sean A. Irvine
 */
public class A395520 extends DifferenceSequence {

  /** Construct the sequence. */
  public A395520() {
    super(1, new A036349());
  }
}
