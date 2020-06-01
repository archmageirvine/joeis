package irvine.oeis.a334;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A334172 allocated for Christoph Schreier.
 * @author Sean A. Irvine
 */
public class A334172 extends A000040 {

  private Z mP = super.next();

  @Override
  public Z next() {
    final Z t = mP;
    mP = super.next();
    return t.xor(mP).not().add(Z.ONE.shiftLeft(mP.bitLength()));
  }
}
