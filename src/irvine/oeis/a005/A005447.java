package irvine.oeis.a005;

import irvine.math.z.Z;

/**
 * A005447 Numerators of the expansion of <code>-W_{-1}(-e^(-1 - x^2/2))</code> where <code>x &gt; 0</code> and <code>W_{-1}</code> is the Lambert W function.
 * @author Sean A. Irvine
 */
public class A005447 extends A005446 {

  @Override
  public Z next() {
    return get(++mN).num();
  }
}
