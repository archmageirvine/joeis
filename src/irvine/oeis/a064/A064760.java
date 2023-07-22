package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.oeis.a002.A002034;

/**
 * A064760 Variant of A002034 with initial term 0.
 * @author Georg Fischer
 */
public class A064760 extends A002034 {

  private int mN = 0;

  @Override
  public Z next() {
    final Z result = super.next();
    return (++mN == 1) ? Z.ZERO : result;
  }
}
