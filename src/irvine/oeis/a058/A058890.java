package irvine.oeis.a058;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A058890 Smallest number of nodes in a graph whose automorphism group is cyclic of order n.
 * @author Sean A. Irvine
 */
public class A058890 extends Sequence1 {

  private long mN = 0;

  private Z a(final long n) {
    if (n == 1) {
      return Z.ZERO;
    }
    if (n == 2) {
      return Z.TWO;
    }
    if ((n & (n - 1)) == 0) {
      return Z.valueOf(n + 6);
    }
    final FactorSequence fs = Jaguar.factor(n);
    if (fs.omega() == 1) {
      final Z p = fs.toZArray()[0];
      final int e = fs.getExponent(p);
      if (Z.THREE.equals(p) || Z.FIVE.equals(p)) {
        return p.pow(e).add(p.multiply2());
      } else {
        return p.pow(e).add(p);
      }
    }
    Z sum = Z.ZERO;
    for (final Z p : fs.toZArray()) {
      final int e = fs.getExponent(p);
      sum = sum.add(a(p.pow(e).longValueExact()));
    }
    final int n3 = fs.getExponent(Z.THREE);
    if (n3 == 0) {
      return sum;
    }
    final int n2 = fs.getExponent(Z.TWO);
    final int n5 = fs.getExponent(Z.FIVE);
    if (n2 == 2 && n3 >= 1 && n5 == 1) {
      return sum.subtract(4);
    }
    if (n2 != 2 && n3 >= 1 && n5 == 1) {
      return sum.subtract(3);
    }
    if (n2 == 2 && n3 >= 1 /*&& n5 != 1*/) {
      return sum.subtract(1);
    }
    if (n2 >= 2 && n3 == 1 /*&& n5 != 1*/) {
      return sum.subtract(1);
    }
    return sum;
  }

  @Override
  public Z next() {
    return a(++mN);
  }
}
