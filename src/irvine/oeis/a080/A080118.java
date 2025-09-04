package irvine.oeis.a080;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.a055.A055094;

/**
 * A080118 Intersection of A080117 and A014486.
 * @author Sean A. Irvine
 */
public class A080118 extends A080114 {

  private final DirectSequence mA = new A055094();
  private final DirectSequence mB = new A080261();

  @Override
  public Z next() {
    final Z p = super.next();
    final Z c = mA.a(p);
    return p.mod(4) == 3 ? c : mB.a(c);
  }
}

