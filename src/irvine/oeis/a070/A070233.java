package irvine.oeis.a070;

import irvine.math.z.Z;

/**
 * A070233 Let u(k), v(k), w(k) satisfy the recursions u(1) = v(1) = w(1) = 1,  u(k+1) = u(k) + v(k) + w(k), v(k+1) = u(k)*v(k) + v(k)*w(k) + w(k)*u(k), and w(k+1) = u(k)*v(k)*w(k) for k &gt;= 1; then a(n) = w(n).
 * @author Sean A. Irvine
 */
public class A070233 extends A070231 {

  @Override
  protected Z select(final Z u, final Z v, final Z w) {
    return w;
  }
}

