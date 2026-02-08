package irvine.oeis.a083;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a003.A003418;

/**
 * A083685 a(n) is the smallest prime of the form k*lcm(1..n) - 1.
 * @author Sean A. Irvine
 */
public class A083685 extends Sequence1 {

  private final Sequence mA = new A003418().skip();

  @Override
  public Z next() {
    final Z m = mA.next();
    Z t = m.subtract(1);
    while (!t.isProbablePrime()) {
      t = t.add(m);
    }
    return t;
  }
}
