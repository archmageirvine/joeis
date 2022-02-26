package irvine.oeis.a054;

import irvine.math.z.Z;
import irvine.oeis.a002.A002110;

/**
 * A054845.
 * @author Sean A. Irvine
 */
public class A054850 extends A002110 {

  {
    super.next();
  }

  @Override
  public Z next() {
    return Z.valueOf(super.next().bitLength() - 1);
  }
}
