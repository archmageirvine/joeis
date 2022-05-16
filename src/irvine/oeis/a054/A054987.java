package irvine.oeis.a054;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A054987 Smallest composite x such that sigma(x+2^n) = sigma(x) + 2^n.
 * @author Sean A. Irvine
 */
public class A054987 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    final Z f = Z.ONE.shiftLeft(++mN);
    Z k = Z.THREE;
    while (true) {
      k = k.add(1);
      if (!k.isProbablePrime() && Jaguar.factor(f.add(k)).sigma().equals(Jaguar.factor(k).sigma().add(f))) {
        return k;
      }
    }
  }
}
