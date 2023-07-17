package irvine.oeis.a055;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a000.A000400;

/**
 * A055036 Min[x] composite zero site for sigma(x+6^n) - sigma(x) - 6^n.
 * @author Sean A. Irvine
 */
public class A055036 extends A000400 {

  /** Construct the sequence. */
  public A055036() {
    super(1);
  }

  {
    super.next();
  }

  @Override
  public Z next() {
    final Z f = super.next();
    Z k = Z.THREE;
    while (true) {
      k = k.add(1);
      if (!k.isProbablePrime() && Jaguar.factor(f.add(k)).sigma().equals(Jaguar.factor(k).sigma().add(f))) {
        return k;
      }
    }
  }
}
