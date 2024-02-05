package irvine.oeis.a068;

import irvine.factor.prime.Puma;
import irvine.math.z.Z;

/**
 * A068193 The prime indices of sequence A068192. (That sequence is conjectured to contain only primes.).
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
