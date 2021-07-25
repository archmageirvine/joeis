package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.ComplementSequence;
import irvine.oeis.a003.A003401;

/**
 * A004169 Values of m for which a regular polygon with m sides cannot be constructed with ruler and compass.
 * @author Sean A. Irvine
 */
public class A004169 extends ComplementSequence {

  /** Construct the sequence. */
  public A004169() {
    super(new A003401(), Z.SEVEN);
  }
}
