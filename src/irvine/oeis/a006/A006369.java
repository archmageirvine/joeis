package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence0;

/**
 * A006369 a(n) = 2*n/3 for n divisible by 3, otherwise a(n) = round(4*n/3). Or, equivalently, a(3*n-2) = 4*n-3, a(3*n-1) = 4*n-1, a(3*n) = 2*n.
 * Or, equivalently, a(3*n-2) = 4*n-3, a(3*n-1) = 4*n-1, a(3*n) = 2*n,
 * Or, equivalently, a(3*m+1) = 4*m+1, a(3*m+2) = 4*m+3, a(3*n) = 2*n.
 * @author Sean A. Irvine
 */
public class A006369 extends Sequence0 implements DirectSequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    final Z t = mN.add(1);
    return mN.signedAdd(t.mod(3) != 1, t.divide(3));
  }

  @Override
  public Z a(final Z n) {
    final Z[] n3 = n.divideAndRemainder(Z.THREE);
    return n3[1].isZero() ? n3[0].multiply2() : (n3[1].isOne() ? n3[0].multiply(4).add(1) : n3[0].multiply(4).add(3));
  }

  @Override
  public Z a(final long n) {
    if (n == 0L) {
      return Z.ZERO;
    }
    final long n3 = n % 3L;
    return Z.valueOf(n3 == 0L ? (n / 3) * 2 : (n3 == 1L ? (n / 3) * 4 + 1 : (n / 3) * 4 + 3));
  }

}
