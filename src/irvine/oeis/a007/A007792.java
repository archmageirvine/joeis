package irvine.oeis.a007;

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.MultiplicativeSequence;

/**
 * A007792 From a problem concerning circulant matrices and Gauss sums.
 * @author Sean A. Irvine
 */
public class A007792 extends MultiplicativeSequence {

  /** Construct the sequence. */
  public A007792() {
    super(1, (p, e) -> {
      if (p.equals(Z.TWO)) {
        if (e == 1) {
          return Z.EIGHT;
        }
        return (e & 1) == 0
          ? Z.valueOf(9L * e * e - 30L * e + 64).shiftLeft(4L * e - 4)
          : Z.valueOf(9L * e * e - 60L * e + 155).shiftLeft(4L * e - 4);
      }
      if (p.equals(Z.THREE)) {
        if (e == 1) {
          return Z.valueOf(3 * 3 * 3 * 3);
        }
        return Z.THREE.pow(4L * e).multiply(2L * e * e - 8L * e + 13);
      }
      if (p.mod(6) == 1) {
        return p.pow(5L * e).subtract(p.subtract(1).pow(5).multiply(p.pow(4L * (e - 1))).multiply(Integers.SINGLETON.sum(0, e - 1, j -> Binomial.binomial(j + 4, 4).multiply(p.pow(e - 1 - j)))));
      } else {
        // == 5 (mod 6);
        return p.pow(5L * e).subtract(p.subtract(1).multiply(p.square().subtract(1).square()).multiply(p.pow(4L * (e - 1))).multiply(Integers.SINGLETON.sum(0, e - 1, j -> Binomial.binomial(j / 2 + 2, 2).multiply(p.pow(e - 1 - j)))));
      }
    });
  }
}
