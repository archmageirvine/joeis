package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.MultiplicativeSequence;

/**
 * A007789 a(n) = (1/n) * Sum_{x in (Z/nZ)^3} e^(2*Pi*i*det(circ(x))/n), the normalized Gauss sum of the 3 X 3 circulant determinant.
 * @author Sean A. Irvine
 */
public class A007789 extends MultiplicativeSequence {

  /** Construct the sequence. */
  public A007789() {
    super(1, (p, e) -> {
      if (Z.THREE.equals(p)) {
        return e == 1 ? Z.ZERO : Z.THREE.pow(e + 1);
      }
      if (p.mod(3) == 1) {
        return p.pow(e - 1).multiply(p.multiply(e + 1).subtract(e));
      }
      return p.pow((e / 2) * 2);
    });
  }
}
