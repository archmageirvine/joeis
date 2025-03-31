package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.oeis.a076.A076270;

/**
 * A064896 Numbers of the form (2^(m*r)-1)/(2^r-1) for positive integers m, r.
 * @author Sean A. Irvine
 */
public class A064896 extends A076270 {

  /** Construct the sequence. */
  public A064896() {
    super(Z.TWO);
  }
}
