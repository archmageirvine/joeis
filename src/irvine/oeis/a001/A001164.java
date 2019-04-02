package irvine.oeis.a001;

import irvine.math.z.Z;

/**
 * A001164 Stirling's formula: denominators of asymptotic series for Gamma function.
 * @author Sean A. Irvine
 */
public class A001164 extends A001163 {

  @Override
  public Z next() {
    return nextQ().den();
  }
}
