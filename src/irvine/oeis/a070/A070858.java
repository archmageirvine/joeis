package irvine.oeis.a070;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a003.A003418;

/**
 * A070858 Smallest prime == 1 mod L, where L = LCM of 1 to n.
 * @author Sean A. Irvine
 */
public class A070858 extends Sequence1 {

  private final Sequence mA = new A003418().skip();

  @Override
  public Z next() {
    final Z m = mA.next();
    Z t = m.add(1);
    while (!t.isProbablePrime()) {
      t = t.add(m);
    }
    return t;
  }
}
