package irvine.oeis.a061;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a000.A000217;

/**
 * A061380 Triangular numbers with product of digits also a triangular number.
 * @author Sean A. Irvine
 */
public class A061380 extends A000217 {

  /** Construct the sequence. */
  public A061380() {
    super(1);
  }

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      Z prod = Z.ONE;
      for (Z m = t; !m.isZero(); m = m.divide(10)) {
        prod = prod.multiply(m.mod(10));
      }
      if (ZUtils.isTriangular(prod)) {
        return t;
      }
    }
  }
}

