package irvine.oeis.a036;

import irvine.math.z.Euler;
import irvine.math.z.Z;

/**
 * A036912 Indices of the left-to-right maxima in A057635.
 * @author Sean A. Irvine
 */
public class A036912 extends A036913 {

  @Override
  public Z next() {
    return Euler.phi(super.next());
  }
}
