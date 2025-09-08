package irvine.oeis.a080;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.a000.A000040;
import irvine.oeis.a055.A055094;

/**
 * A080146 Binary encoding of quadratic residue set for each prime. a(n) = A055094(A000040(n)).
 * @author Sean A. Irvine
 */
public class A080146 extends A000040 {

  private final DirectSequence mA = new A055094();

  @Override
  public Z next() {
    return mA.a(super.next());
  }
}
