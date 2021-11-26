package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005184 Self-contained numbers: odd numbers k whose Collatz sequence contains a higher multiple of k.
 * @author Sean A. Irvine
 */
public class A005184 implements Sequence {

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
          return mN;
        }
      }
    }
  }
}
