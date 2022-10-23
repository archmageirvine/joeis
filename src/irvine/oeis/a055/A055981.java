package irvine.oeis.a055;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000142;
import irvine.oeis.a027.A027423;

/**
 * A055981 a(n) = ceiling(n!/d(n!)).
 * @author Sean A. Irvine
 */
public class A055981 extends A000142 {

  private final Sequence mA = new A027423();
  {
    setOffset(1);
    next();
  }

  @Override
  public Z next() {
    final Z t = mA.next();
    return super.next().add(t).subtract(1).divide(t);
  }
}
