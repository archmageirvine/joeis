package irvine.oeis.a046;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A046080 a(n) is the number of integer-sided right triangles with hypotenuse n.
 * @author Sean A. Irvine
 */
public class A046080 extends AbstractSequence {

  /** Construct the sequence. */
  public A046080() {
    super(1);
  }

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long m = mN;
    while ((m & 1) == 0) {
      m >>>= 1;
    }
    Z prod = Z.ONE;
    final FactorSequence fs = Jaguar.factor(m);
    for (final Z p : fs.toZArray()) {
      final int e = fs.getExponent(p);
      if (p.mod(4) == 1) {
        prod = prod.multiply(2L * e + 1);
      }
    }
    return prod.subtract(1).divide2();
  }
}
