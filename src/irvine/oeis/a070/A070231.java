package irvine.oeis.a070;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A070231 Let u(k), v(k), w(k) satisfy the recursions u(1) = v(1) = w(1) = 1, u(k+1) = u(k) + v(k) + w(k), v(k+1) = u(k)*v(k) + v(k)*w(k) + w(k)*u(k), and w(k+1) = u(k)*v(k)*w(k) for k &gt;= 1; then a(n) = u(n).
 * @author Sean A. Irvine
 */
public class A070231 extends Sequence1 {

  private Z mU = null;
  private Z mV = Z.ONE;
  private Z mW = Z.ONE;

  protected Z select(final Z u, final Z v, final Z w) {
    return u;
  }

  @Override
  public Z next() {
    if (mU == null) {
      mU = Z.ONE;
    } else {
      final Z u = mU.add(mV).add(mW);
      final Z v = mU.multiply(mV).add(mV.multiply(mW)).add(mW.multiply(mU));
      final Z w = mU.multiply(mV).multiply(mW);
      mU = u;
      mV = v;
      mW = w;
    }
    return select(mU, mV, mW);
  }
}

