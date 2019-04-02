package irvine.oeis.a046;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A046080 a(n) = number of integer-sided right triangles with hypotenuse n.
 * @author Sean A. Irvine
 */
public class A046080 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long m = mN;
    while ((m & 1) == 0) {
      m >>>= 1;
    }
    Z prod = Z.ONE;
    final FactorSequence fs = Cheetah.factor(m);
    for (final Z p : fs.toZArray()) {
      final int e = fs.getExponent(p);
      if (p.mod(4) == 1) {
        prod = prod.multiply(2L * e + 1);
      }
    }
    return prod.subtract(1).divide2();
  }
}
