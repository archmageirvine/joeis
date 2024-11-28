package irvine.math.dirichlet;

import irvine.math.z.Z;

/**
 * Dirichlet series for <code>1/(1-p^(-s))</code>.
 * @author Sean A. Irvine
 */
class ZetaM extends AbstractDs {

  private final long mP;
  private final Z mF;

  /**
   * Construct the Dirichlet series for <code>1/(1-p^(-m*s))</code>.
   * @param p prime
   * @param f scalar coefficient
   */
  ZetaM(final long p, final Z f) {
    mP = p;
    mF = f;
  }

  @Override
  public Z coeff(final Z n) {
    if (Z.ONE.equals(n)) {
      return Z.ONE;
    }
    Z r = n;
    long cnt = 0;
    while (true) {
      final Z[] qr = r.divideAndRemainder(mP);
      if (!qr[1].isZero()) {
        break;
      }
      r = qr[0];
      ++cnt;
    }
    return cnt == 0 || !Z.ONE.equals(r) ? Z.ZERO : mF.pow(cnt);
  }
}
