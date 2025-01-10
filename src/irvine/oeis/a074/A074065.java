package irvine.oeis.a074;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A074065 Numerators a(n) of fractions slowly converging to sqrt(3): let a(1) = 0, b(n) = n - a(n); if (a(n) + 1) / b(n) &lt; sqrt(3), then a(n+1) = a(n) + 1, else a(n+1)= a(n).
 * @author Sean A. Irvine
 */
public class A074065 extends Sequence1 {

  private static final CR C = CR.THREE.subtract(CR.THREE.sqrt()).divide(CR.TWO);
  private long mN = 0;

  @Override
  public Z next() {
    return C.multiply(++mN).floor();
  }
}
