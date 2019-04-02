package irvine.oeis.a005;

import irvine.math.z.Z;

/**
 * A005447 Numerators of the expansion of -W_{-1}(-e^(-1 - x^2/2)) where x &gt; 0 and W_{-1} is the Lambert W function.
 * @author Sean A. Irvine
 */
public class A005447 extends A005446 {

  @Override
  public Z next() {
    return get(++mN).num();
  }
}
