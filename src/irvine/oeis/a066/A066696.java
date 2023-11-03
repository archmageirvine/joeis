package irvine.oeis.a066;

import irvine.math.z.Z;
import irvine.oeis.a062.A062373;

/**
 * A066696 Numbers k such that Euler phi(k) / Carmichael lambda(k) = 14.
 * @author Sean A. Irvine
 */
public class A066696 extends A062373 {

  /** Construct the sequence. */
  public A066696() {
    super(Z.valueOf(14));
  }
}
