package irvine.oeis.a257;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence0;

/**
 * A257297 a(n) = (initial digit of n) * (n with initial digit removed).
 * @author Sean A. Irvine
 */
public class A257297 extends Sequence0 implements DirectSequence {

  private long mN = -1;

  @Override
  public Z next() {
    return a(++mN);
  }

  @Override
  public Z a(final Z n) {
    return a(n.longValueExact());
  }

  @Override
  public Z a(final long n) {
    if (n < 11) {
      return Z.ZERO;
    }
    final String s = String.valueOf(n);
    return new Z(s.substring(1)).multiply(s.charAt(0) - '0');
  }
}

