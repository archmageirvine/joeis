package irvine.oeis.a002;

import irvine.math.z.Z;

/**
 * A002888 a(n) is the cutting number of the tree corresponding to A002887(n).
 * @author Sean A. Irvine
 */
public class A002888 extends A002887 {

  @Override
  public Z next() {
    super.next();
    return Z.valueOf(mFirstCuttingNumber.get(mM));
  }
}
