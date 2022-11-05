package irvine.oeis.a045;

import irvine.math.z.Z;
import irvine.oeis.a002.A002110;

/**
 * A045716 a(n) is the binary order (A029837) of the n-th primorial number, A002110(n).
 * @author Sean A. Irvine
 */
public class A045716 extends A002110 {

  {
    setOffset(1);
    super.next();
  }

  @Override
  public Z next() {
    return Z.valueOf(super.next().subtract(1).bitLength());
  }
}
