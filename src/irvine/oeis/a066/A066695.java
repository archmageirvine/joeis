package irvine.oeis.a066;

import irvine.math.z.Z;
import irvine.oeis.a062.A062373;

/**
 * A066695 Numbers k such that Euler phi(k) / Carmichael lambda(k) = 12.
 * @author Sean A. Irvine
 */
public class A066695 extends A062373 {

  /** Construct the sequence. */
  public A066695() {
    super(Z.valueOf(12));
  }
}
