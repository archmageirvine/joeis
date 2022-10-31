package irvine.oeis.a060;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a002.A002476;

/**
 * A060203.
 * @author Sean A. Irvine
 */
public class A060203 extends Sequence1 {

  private final Sequence mA = new A002476();

  @Override
  public Z next() {
    final Z p = mA.next();
    Z k = Z.ONE;
    while (true) {
      k = k.add(1);
      if (k.modPow(Z.THREE, p).equals(Z.ONE)) {
        return k;
      }
    }
  }
}
