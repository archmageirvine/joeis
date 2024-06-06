package irvine.oeis.a070;

import irvine.math.z.Z;

/**
 * A070234 Let u(k), v(k), w(k) satisfy the recursions u(1) = v(1) = w(1) = 1, u(k+1) = u(k) + v(k) + w(k), v(k+1) = u(k)*v(k) + v(k)*w(k) + w(k)*u(k), and w(k+1) = u(k)*v(k)*w(k); then a(n) = v(n).
 * @author Sean A. Irvine
 */
public class A070234 extends A070231 {

  @Override
  protected Z select(final Z u, final Z v, final Z w) {
    return v;
  }
}

