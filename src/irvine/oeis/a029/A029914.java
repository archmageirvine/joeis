package irvine.oeis.a029;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A029914 Start with n; repeatedly sum squares of prime factors (counted with multiplicity), until reach a prime p, then set a(n) = p; if reach a fixed point q, set a(n) = q; set a(n) = 0 if no limit exists.
 * @author Sean A. Irvine
 */
public class A029914 extends Sequence2 {

  private Z mN = Z.ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    Z m = mN;
    Z prev;
    do {
      prev = m;
      m = A029913.sopfrSquares(Jaguar.factor(m));
    } while (!m.isProbablePrime() && !prev.equals(m));
    return m;
  }
}
