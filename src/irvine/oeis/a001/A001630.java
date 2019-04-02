package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.a000.A000078;

/**
 * A001630 Tetranacci numbers: a(n) = a(n-1) + a(n-2) + a(n-3) + a(n-4), with a(0)=a(1)=0, a(2)=1, a(3)=2.
 * @author Sean A. Irvine
 */
public class A001630 extends A000078 {

  private Z mA = super.next();

  @Override
  public Z next() {
    final Z t = super.next();
    final Z r = mA.add(t);
    mA = t;
    return r;
  }
}
