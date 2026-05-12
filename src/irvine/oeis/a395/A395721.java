package irvine.oeis.a395;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a005.A005117;

/**
 * A395721 allocated for Michael De Vlieger.
 * @author Sean A. Irvine
 */
public class A395721 extends Sequence1 {

  private final Sequence mA = new A005117();

  @Override
  public Z next() {
    final Z m = mA.next();
    Z k = m.square();
    while (true) {
      final Z t = k;
      k = k.subtract(1);
      if (m.mod(Functions.RAD.z(k)).isZero() && m.mod(Functions.RAD.z(t)).isZero()) {
        return k.isZero() ? Z.NEG_ONE : k;
      }
    }
  }
}
