package irvine.oeis.a029;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A029914 Start with n; repeatedly sum squares of prime factors (counted with multiplicity), until reach a prime p, then set <code>a(n) =</code> p; if reach a fixed point q, set <code>a(n) =</code> q; set <code>a(n) = 0</code> if no limit exists.
 * @author Sean A. Irvine
 */
public class A029914 implements Sequence {

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
