package irvine.oeis.a007;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.MultiplicativeSequence;

/**
 * A007790 From a problem concerning circulant matrices and Gauss sums.
 * @author Sean A. Irvine
 */
public class A007790 extends MultiplicativeSequence {

  /** Construct the sequence. */
  public A007790() {
    super(1, (p, e) -> {
      if (Z.TWO.equals(p)) {
        switch(e) {
          case 1:
            return Z.ZERO;
          case 2:
            return Z.valueOf(32);
          case 3:
            return Z.valueOf(256);
          case 4:
            return Z.valueOf(2048);
          default:
            return Z.valueOf(e - 4).shiftLeft(2L * e + 2);
        }
      }
      if (p.mod(4) == 1) {
        return p.square().multiply(Functions.TRIANGULAR.z(e + 1)).subtract(p.multiply(e * (e + 2L))).add(p.pow(2L * e - 2));
      }
      assert p.mod(4) == 3;
      if ((e & 1) == 1) {
        return p.square().multiply((e + 1) / 2).add(p).subtract(p.pow(2L * e - 2).multiply((e + 1) / 2));
      } else {
        return p.pow(2L * e - 2).multiply(p.square().multiply((e + 2) / 2).subtract(e / 2));
      }
    });
  }
}
