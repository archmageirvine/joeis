package irvine.oeis.a066;

import irvine.math.z.Z;
import irvine.oeis.a062.A062373;

/**
 * A066697 Numbers k such that Euler phi(k) / Carmichael lambda(k) = 18.
 * @author Sean A. Irvine
 */
public class A066697 extends A062373 {

  /** Construct the sequence. */
  public A066697() {
    super(Z.valueOf(18));
  }
}
