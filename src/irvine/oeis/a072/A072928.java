package irvine.oeis.a072;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A072928 Let p_0(n) := the n-th prime number, taking the first prime number to be 2; p_[i+1](n) = p_i(p_i(n)); then a(n) := p_n(1).
 * @author Sean A. Irvine
 */
public class A072928 extends Sequence0 {

  private int mN = -1;

  private Z p(final int k, final Z m) {
    return k == 0 ? Functions.PRIME.z(m) : p(k - 1, p(k - 1, m));
  }

  @Override
  public Z next() {
    return p(++mN, Z.ONE);
  }
}

