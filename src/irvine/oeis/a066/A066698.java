package irvine.oeis.a066;

import irvine.math.z.Z;
import irvine.oeis.a062.A062373;

/**
 * A066698 Numbers k such that Euler phi(k) / Carmichael lambda(k) = 34.
 * @author Sean A. Irvine
 */
public class A066698 extends A062373 {

  /** Construct the sequence. */
  public A066698() {
    super(Z.valueOf(34));
  }
}
