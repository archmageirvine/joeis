package irvine.oeis.a084;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;

/**
 * A084495 Permutation of Z, obtained by reflecting the juggling sequence A084511 from positive to negative numbers (with zero thrown at beat 0), folded to N with functions N2Z and Z2N.
 * @author Sean A. Irvine
 */
public class A084495 extends A084452 {

  private static final Z NEG3 = Z.valueOf(-3);
  private final DirectSequence mA = DirectSequence.create(new A084511());
  private final DirectSequence mB = DirectSequence.create(new A084494());
  private long mN = 0;

  private Z n2z(final long n) {
    return Z.NEG_ONE.pow(n).multiply(n / 2);
  }

  private Z z2n(final Z z) {
    return z.abs().multiply2().add(z.signum() <= 0 ? 1 : 0);
  }

  private Z f(final Z z) {
    return z.add(z.signum() > 0 ? mA.a(z) : (z.compareTo(NEG3) >= 0 ? z.multiply(-2) : mA.a(mB.a(z.negate().subtract(3)))));
  }

  @Override
  public Z next() {
    return z2n(f(n2z(++mN)));
  }
}
