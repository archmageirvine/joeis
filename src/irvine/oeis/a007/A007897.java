package irvine.oeis.a007;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007897 a(n) is multiplicative with a(2) = 1; a(4) = 2; a(2^i) = 2^(i-2)+2 if i&gt;2; a(p^i) = 1+(p-1)*p^(i-1)/2 if prime p&gt;2 and i&gt;0.
 * @author Sean A. Irvine
 */
public class A007897 implements Sequence {

  private long mN = 0;

  private Z a(final Z p, final int e) {
    if (Z.TWO.equals(p)) {
      if (e <= 2) {
        return e == 2 ? Z.TWO : Z.ONE;
      }
      return Z.ONE.shiftLeft(e - 2).add(2);
    }
    return Z.ONE.add(p.subtract(1).multiply(p.pow(e - 1)).divide2());
  }

  @Override
  public Z next() {
    Z prod = Z.ONE;
    final FactorSequence fs = Jaguar.factor(++mN);
    for (final Z p : fs.toZArray()) {
      prod = prod.multiply(a(p, fs.getExponent(p)));
    }
    return prod;
  }
}
