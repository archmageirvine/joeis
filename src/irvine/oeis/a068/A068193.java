package irvine.oeis.a068;

import irvine.factor.prime.Puma;
import irvine.math.z.Z;

/**
 * A068192.
 * @author Sean A. Irvine
 */
public class A068193 extends A068192 {

  @Override
  public Z next() {
    final Z t = super.next();
    if (!t.isProbablePrime()) {
      throw new UnsupportedOperationException("Found non-prime in A068192: " + t);
    }
    return Puma.primePiZ(t);
  }
}
