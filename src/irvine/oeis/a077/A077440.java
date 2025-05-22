package irvine.oeis.a077;

import irvine.math.z.Z;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A077440 Squares and their roots having square decimal digits.
 * @author Sean A. Irvine
 */
public class A077440 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A077440() {
    super(1, new A077439(), Z::square);
  }
}
