package irvine.oeis.a059;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A059198 Ratios arising in A005184.
 * @author Sean A. Irvine
 */
public class A059198 implements Sequence {

  private Z mN = Z.valueOf(29);

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(2);
      Z t = mN;
      while (true) {
        t = t.makeOdd();
        if (t.equals(Z.ONE)) {
          break;
        }
        t = t.multiply(3).add(1);
        if (t.mod(mN).isZero()) {
          return t.divide(mN);
        }
      }
    }
  }
}
