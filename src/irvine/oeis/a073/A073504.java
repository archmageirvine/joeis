package irvine.oeis.a073;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A073500.
 * @author Sean A. Irvine
 */
public class A073504 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    Z a;
    Z b = Z.ONE;
    Z c = Z.valueOf(++mN);
    do {
      final Z t = b.divide2().add(c.divide2());
      a = b;
      b = c;
      c = t;
    } while (!a.equals(c) || !a.equals(b));
    return c;
  }
}

