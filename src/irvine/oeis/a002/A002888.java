package irvine.oeis.a002;

import irvine.math.z.Z;

/**
 * A002888.
 * @author Sean A. Irvine
 */
public class A002888 extends A002887 {

  @Override
  public Z next() {
    super.next();
    return Z.valueOf(mFirstCuttingNumber.get(mM));
  }
}
